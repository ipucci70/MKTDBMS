package org.example.MKTDBMS;

import java.io.FileReader;
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
import org.example.Market.MarketInstrument;

public class DBMSInstrument {
    private static final Logger LOG = LogManager.getLogger(DBMSInstrument.class);

    private FileReader reader;
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
                FileReader reader = new FileReader("config/dbConfig.xml");

                if (reader != null){
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

                    session = sqlSessionFactory.openSession();
                    mapper = session.getMapper(InstrumentMapper.class);
    
                    isConnected=true;
                    isConnecting=false;
                }
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
        void handle(MarketInstrument marketInstrument);
    }

    public boolean getAllInstruments(InstrumentCallback instrumentCallback){
        List<IntInstrument> instruments = mapper.getAllInstruments();
        for (IntInstrument intInstrument : instruments) {
            instrumentCallback.handle(intInstrument.ToMarketInstrument());
        }
        return true;
    }

    public void InsertNewInstrument(MarketInstrument marketInstrument){
        IntInstrument newIntInstrument = new IntInstrument(
            marketInstrument.getSecurityID(),
            marketInstrument.getDescription(),
            marketInstrument.getISINCode(),
            marketInstrument.getCUSIP(),
            marketInstrument.getMarketID(),
            marketInstrument.getSectionID(),
            marketInstrument.getTradeClass(),
            marketInstrument.getCurrency(),
            marketInstrument.getIssuer(),
            (long)marketInstrument.getClass_Value(),
            marketInstrument.getPriceTick(),
            marketInstrument.getQtyTick(),
            marketInstrument.getMinTradableQty(),
            marketInstrument.getLotSize(),
            marketInstrument.getClosingPrice(),
            marketInstrument.getIssueDate(),
            marketInstrument.getTradingStartDate(),
            marketInstrument.getTradingStopDate(),
            marketInstrument.getYieldTick(),
            marketInstrument.getBenchmarkSecurityID()
        );
        mapper.insertInstrument(newIntInstrument);
        session.commit();
    }

    public DBMSInstrument() { }
}

