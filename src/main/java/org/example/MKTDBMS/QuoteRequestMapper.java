package org.example.MKTDBMS;

import java.util.List;
import org.example.MKTDBMS.IntQuoteRequest;

import org.apache.ibatis.annotations.*;

public interface QuoteRequestMapper {
    @Select("SELECT * FROM MARKETQUOTEREQUEST")
    List<IntQuoteRequest> getAllQuoteRequests();

    @Insert("INSERT INTO MARKETQUOTEREQUEST (" +
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
    void insertQuoteRequest(IntQuoteRequest intQuoteRequest);
}
