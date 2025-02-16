package org.example.lightadaptercip.utils;

import org.example.Market.InstrumentClass;

public class IntInstrument {
      
    private String securityID;
    private String description;
    private String isinCode;
    private String cusip;
    private String marketID;
    private String sectionID;
    private String tradeClass;
    private String currency;
    private String issuer;
    private long instrumentClass;
    private double priceTick;
    private double qtyTick;
    private double minTradableQty;
    private double lotSize;	
    private double closingPrice;
    private long issueDate;
    private long tradingStartDate;
    private long tradingStopDate;
    private double yieldTick;
    private String benchmarkSecurityID;

    public IntInstrument() {}

    public IntInstrument(
        String securityID,
        String description,
        String isinCode,
        String cusip,
        String marketID,
        String sectionID,
        String tradeClass,
        String currency,
        String issuer,
        long instrumentClass,
        double priceTick,
        double qtyTick,
        double minTradableQty,
        double lotSize,
        double closingPrice,
        long issueDate,
        long tradingStartDate,
        long tradingStopDate,
        double yieldTick,
        String benchmarkSecurityID
        ) {
            this.securityID=securityID;
            this.description=description;
            this.isinCode= isinCode;
            this.cusip=cusip;
            this.marketID=marketID;
            this.sectionID= sectionID;
            this.tradeClass=tradeClass;
            this.currency= currency;
            this.issuer= issuer;
            this.instrumentClass = instrumentClass;
            this.priceTick= priceTick;
            this.qtyTick=qtyTick;
            this.minTradableQty= minTradableQty;
            this.lotSize= lotSize;
            this.closingPrice=closingPrice;
            this.issueDate=issueDate;
            this.tradingStartDate= tradingStartDate;
            this.tradingStopDate=tradingStopDate;
            this.yieldTick=yieldTick;
            this.benchmarkSecurityID=benchmarkSecurityID;
        }
    public String getSecurityID(){
        return this.securityID;
    }
}
