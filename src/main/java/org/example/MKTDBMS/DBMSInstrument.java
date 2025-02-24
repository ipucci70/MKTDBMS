package org.example.MKTDBMS;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.TimerTask;
import java.util.Timer;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.MKTDBMS.InstrumentMapper;
import org.example.MKTDBMS.IntInstrument;
import org.example.Utils;
import org.example.Market.Instrument;

public class DBMSInstrument {
    private static final Logger LOG = LogManager.getLogger(DBMSInstrument.class);

    private Reader reader;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession session;
    private InstrumentMapper mapper;
    private volatile boolean isConnecting=false;
    private volatile boolean isConnected=false;
    private int connectionAttempts = 0;
    private final long MAX_CONNECTION_ATTEMPTS = 50;

    public boolean isConnected() {
        return isConnected;
    }

    public boolean connect() {
        if (!isConnected) {
            isConnecting=true;
            try {
                reader = Resources.getResourceAsReader("config/dbConfig.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

                session = sqlSessionFactory.openSession();
                mapper = session.getMapper(InstrumentMapper.class);

                isConnected=true;
                isConnecting=false;
            }
            catch (IOException e) {
                LOG.warn("Error getting instruments: {} ... (will retry again)\n{}",
                e.getLocalizedMessage(),
                Utils.stackTraceToString(e));
                tryScheduleReconnection();
                return false;
            }
        }
        return isConnected;
    }

    private void tryScheduleReconnection() {
        // connectionAttempts starts at 0
        if (connectionAttempts >= MAX_CONNECTION_ATTEMPTS) {
            LOG.error("Connection FAILED after too many attempts");
            isConnecting=false;
            return;
        }

        // exponential backoff
        final long backoffTimeMs = Utils.exponentialBackoffTimeMs(connectionAttempts);
        LOG.info("Attempting reconnection in {}ms...", backoffTimeMs);
        new Timer().schedule(new ConnectionTask(this), backoffTimeMs);
    }

    private class ConnectionTask extends TimerTask {
        private final DBMSInstrument dbmsInstrument;

        ConnectionTask(DBMSInstrument dbmsInstrument) {
            this.dbmsInstrument = dbmsInstrument;
        }

        @Override
        public void run() {
            synchronized (this) {
                isConnecting = true;
            }
            connectionAttempts++;

            if (dbmsInstrument.connect()) {
                LOG.info("Reconnected. Issuing flush...");
                isConnecting=false;
                isConnected=true;
            }
        }
    }

    public boolean waitForConnection() {
        synchronized (this) {
            while (isConnecting) {
                try {
                    this.wait();
                } catch (InterruptedException ignored) { }
            }
        }
        return true;
    }

    @FunctionalInterface
    public interface InstrumentCallback{
        void handle(Instrument instrument);
    }

    public boolean getAllInstruments(InstrumentCallback instrumentCallback){
        List<IntInstrument> instruments = mapper.getAllInstruments();
        for (IntInstrument intInstrument : instruments) {
            instrumentCallback.handle(intInstrument.ToInstrument());
        }
        return true;
    }

    public void InsertNewInstrument(Instrument instrument){
        IntInstrument newIntInstrument = new IntInstrument(
            instrument.getSecurityID(),
            instrument.getDescription(),
            instrument.getISINCode(),
            instrument.getCUSIP(),
            instrument.getMarketID(),
            instrument.getSectionID(),
            instrument.getTradeClass(),
            instrument.getCurrency(),
            instrument.getIssuer(),
            (long)instrument.getClass_Value(),
            instrument.getPriceTick(),
            instrument.getQtyTick(),
            instrument.getMinTradableQty(),
            instrument.getLotSize(),
            instrument.getClosingPrice(),
            instrument.getIssueDate(),
            instrument.getTradingStartDate(),
            instrument.getTradingStopDate(),
            instrument.getYieldTick(),
            instrument.getBenchmarkSecurityID()
        );
        mapper.insertInstrument(newIntInstrument);
        session.commit();
    }

    public DBMSInstrument() { }
}

