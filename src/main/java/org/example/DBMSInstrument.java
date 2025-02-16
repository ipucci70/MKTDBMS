package org.example.lightadaptercip.utils;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Instrument;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.lightadaptercip.utils.InstrumentMapper;
import org.example.lightadaptercip.utils.IntInstrument;

public class DBMSInstrument {
    private static final Logger LOG = LogManager.getLogger(DBMSInstrument.class);

    private static boolean initialized = false;

    public static boolean isInitialized() {
        return initialized;
    }

    public static boolean initialize() {
        if (!initialized) {

            try (Reader reader = Resources.getResourceAsReader("dbConfig.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

            try (SqlSession session = sqlSessionFactory.openSession()) {
                InstrumentMapper mapper = session.getMapper(InstrumentMapper.class);

                // Insert a new employee
                //IntInstrument newEmployee = new Employee(2, "Jane Smith", "IT", 60000);
                //mapper.insertEmployee(newEmployee);
                //session.commit();

                // Fetch and display all instruments
                List<IntInstrument> instruments = mapper.getAllInstruments();
                for (IntInstrument intInstrument : instruments) {
                    LOG.info("got securityid" + intInstrument.getSecurityID());
                }
                initialized=true;
            }
            } catch (IOException e) {
                LOG.warn("Error getting instruments: {} ... (will retry again)\n{}",
                e.getLocalizedMessage(),
                Utils.stackTraceToString(e));
            }
        }
        return initialized;
    }

    // private constructor to make class not instantiable
    private DBMSInstrument() { }
}

