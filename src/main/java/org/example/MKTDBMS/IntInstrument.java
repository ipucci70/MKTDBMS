package org.example.MKTDBMS;

import org.example.Market.MarketInstrument;
import org.example.Market.MarketInstrumentOrBuilder;

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
    public void setSecurityID(String securityID){
        this.securityID= securityID;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description= description;
    }

    public String getIsinCode(){
        return this.isinCode;
    }
    public void setIsinCode(String isinCode){
        this.isinCode= isinCode;
    }

    public String getCusip(){
        return this.cusip;
    }
    public void setCusip(String cusip){
        this.cusip= cusip;
    }

    public String getMarketID(){
        return this.marketID;
    }
    public void setMarketID(String marketID){
        this.marketID= marketID;
    }

    public String getSectionID(){
        return this.sectionID;
    }
    public void setSectionID(String sectionID){
        this.sectionID= sectionID;
    }

    public String getTradeClass(){
        return this.tradeClass;
    }
    public void setTradeClass(String tradeClass){
        this.tradeClass= tradeClass;
    }

    public String getCurrency(){
        return this.currency;
    }
    public void setCurrency(String currency){
        this.currency= currency;
    }

    public String getIssuer(){
        return this.issuer;
    }
    public void setIssuer(String issuer){
        this.issuer= issuer;
    }

    public long getInstrumentClass(){
        return this.instrumentClass;
    }
    public void setInstrumentClass(long instrumentClass){
        this.instrumentClass= instrumentClass;
    }

    public double getPriceTick(){
        return this.priceTick;
    }
    public void setpriceTick(double priceTick){
        this.priceTick= priceTick;
    }

    public double getQtyTick(){
        return this.qtyTick;
    }
    public void set(double qtyTick){
        this.qtyTick= qtyTick;
    }

    public double getMinTradableQty(){
        return this.minTradableQty;
    }
    public void setminTradableQty(double minTradableQty){
        this.minTradableQty= minTradableQty;
    }

    public double getLotSize(){
        return this.lotSize;
    }
    public void setLotSize(double lotSize){
        this.lotSize= lotSize;
    }

    public double getClosingPrice(){
        return this.closingPrice;
    }
    public void setClosingPrice(double closingPrice){
        this.closingPrice= closingPrice;
    }

    public long getIssueDate(){
        return this.issueDate;
    }
    public void setIssueDate(long issueDate){
        this.issueDate= issueDate;
    }
    
    public long getTradingStartDate(){
        return this.tradingStartDate;
    }
    public void setTradingStartDate(long tradingStartDate){
        this.tradingStartDate= tradingStartDate;
    }

    public long getTradingStopDate(){
        return this.tradingStopDate;
    }
    public void setTradingStopDate(long tradingStopDate){
        this.tradingStopDate= tradingStopDate;
    }

    public double getYieldTick(){
        return this.yieldTick;
    }
    public void setYieldTick(double yieldTick){
        this.yieldTick= yieldTick;
    }

    public String getBenchmarkSecurityID(){
        return this.benchmarkSecurityID;
    }
    public void setBenchmarkSecurityID(String benchmarkSecurityID){
        this.benchmarkSecurityID= benchmarkSecurityID;
    }

    public MarketInstrument ToMarketInstrument(){
        MarketInstrument.Builder newInstrumentBuilder = MarketInstrument.newBuilder();

        if (this.securityID!= null){
            newInstrumentBuilder.setSecurityID(this.getSecurityID());
        }
        if (this.description!= null){
            newInstrumentBuilder.setDescription(this.getDescription());
        }
        if (this.isinCode != null){
            newInstrumentBuilder.setISINCode(this.getIsinCode());
        }
        if (this.cusip!= null){
            newInstrumentBuilder.setCUSIP(this.getCusip());
        }
        if (this.marketID!= null){
            newInstrumentBuilder.setMarketID(this.getMarketID());
        }
        if (this.sectionID!= null){
            newInstrumentBuilder.setSectionID(this.getSectionID());
        }
        if (this.tradeClass!= null){
            newInstrumentBuilder.setTradeClass(this.getTradeClass());
        }
        if (this.currency!= null){
            newInstrumentBuilder.setCurrency(this.getCurrency());
        }
        if (this.issuer!=null){
            newInstrumentBuilder.setIssuer(this.getIssuer());
        }
        newInstrumentBuilder.setClass_Value((int)this.getInstrumentClass());
        newInstrumentBuilder.setPriceTick(this.getPriceTick());
        newInstrumentBuilder.setQtyTick(this.getQtyTick());
        newInstrumentBuilder.setMinTradableQty(this.getMinTradableQty());
        newInstrumentBuilder.setLotSize(this.getLotSize());
        newInstrumentBuilder.setClosingPrice(this.getClosingPrice());
        newInstrumentBuilder.setIssueDate(this.getIssueDate());
        newInstrumentBuilder.setTradingStartDate(this.getTradingStartDate());
        newInstrumentBuilder.setTradingStopDate(this.getTradingStopDate());
        newInstrumentBuilder.setYieldTick(this.getYieldTick());
        if (this.benchmarkSecurityID!= null){
            newInstrumentBuilder.setBenchmarkSecurityID(this.getBenchmarkSecurityID());
        }

        MarketInstrument newMarketInstrument = newInstrumentBuilder.build();
        return newMarketInstrument;
    }
}
