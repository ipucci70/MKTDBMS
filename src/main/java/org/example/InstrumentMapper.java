package org.example;

import java.util.List;
import org.example.IntInstrument;

import org.apache.ibatis.annotations.*;

public interface InstrumentMapper {
    @Select("SELECT * FROM INSTRUMENT")
    List<IntInstrument> getAllInstruments();

    @Insert("INSERT INTO INSTRUMENT (" +
        "SecurityID," +
        "Description,"+
        "ISINCode,"+
        "CUSIP,"+
        "MarketID,"+
        "SectionID,"+
        "TradeClass,"+
        "Currency,"+
        "Issuer,"+
        "InstrumentClass,"+
        "PriceTick,"+
        "QtyTick,"+
        "MinTradableQty,"+
        "LotSize,"+
        "ClosingPrice,"+
        "IssueDate,"+
        "TradingStartDate,"+
        "TradingStopDate,"+
        "YieldTick,"+
        "BenchmarkSecurityID"+
    ") VALUES (" +
        "#{securityID}," +
        "#{description}," +
        "#{isinCode}," +
        "#{cusip}," +
        "#{marketID}," +
        "#{sectionID}," +
        "#{tradeClass}," +
        "#{currency}," +
        "#{issuer}," +
        "#{instrumentClass}," +
        "#{priceTick}," +
        "#{qtyTick}," +
        "#{minTradableQty}," +
        "#{lotSize}," +
        "#{closingPrice}," +
        "#{issueDate}," +
        "#{tradingStartDate}," +
        "#{tradingStopDate}," +
        "#{yieldTick}," +
        "#{benchmarkSecurityID}" +
    ")")
    void insertInstrument(IntInstrument instrument);
}
