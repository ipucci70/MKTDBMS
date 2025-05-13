package org.example.MKTDBMS;

import org.example.Market;
import org.example.Market.MarketInstrument;
import org.example.Market.MarketLegVerb;
import org.example.Market.MarketProcessStatus;
import org.example.Market.MarketQuoteLegOrBuilder;
import org.example.Market.MarketQuoteRequest;
import org.example.Market.MarketQuoteRequestStatus;;

public class IntQuoteRequest {
    String quoteRequestID;
    String clientQuoteRequestID;
    long mLegType;
    long type;
    String firstLegSecurityID;
	double firstLegPrice;
	double firstLegYield;
	double firstLegQuantity;
	double firstLegMinimumQty;
	long firstLegVerb;
	String firstLegMarketID;
    String secondLegSecurityID;
	double secondLegPrice;
	double secondLegYield;
	double secondLegQuantity;
	double secondLegMinimumQty;
	long secondLegVerb;
	String secondLegMarketID;
    String thirdLegSecurityID;
	double thirdLegPrice;
	double thirdLegYield;
	double thirdLegQuantity;
	double thirdLegMinimumQty;
	long thirdLegVerb;
	String thirdLegMarketID;
    String issuerMemberID;
	String issuerOperatorID;
	long numberOfDestinationMembers;
	String destinationMember_1;
    String destinationMember_2;
    String destinationMember_3;
    String destinationMember_4;
    String destinationMember_5;
    String destinationMember_6;
    String destinationMember_7;
    String destinationMember_8;
    String destinationMember_9;
    String destinationMember_10;
    String destinationMember_11;
    String destinationMember_12;
    String destinationMember_13;
    String destinationMember_14;
    String destinationMember_15;
    String destinationMember_16;
    String destinationMember_17;
    String destinationMember_18;
    String destinationMember_19;
    String destinationMember_20;
    String destinationMember_21;
    String destinationMember_22;
    String destinationMember_23;
    String destinationMember_24;
    String destinationMember_25;
    String destinationMember_26;
    String destinationMember_27;
    String destinationMember_28;
    String destinationMember_29;
    String destinationMember_30;
    String destinationMember_31;
    String destinationMember_32;
    String destinationMember_33;
    String destinationMember_34;
    String destinationMember_35;
    String destinationMember_36;
    String destinationMember_37;
    String destinationMember_38;
    String destinationMember_39;
    String destinationMember_40;
    String destinationMember_41;
    String destinationMember_42;
    String destinationMember_43;
    String destinationMember_44;
    String destinationMember_45;
    String destinationMember_46;
    String destinationMember_47;
    String destinationMember_48;
    String destinationMember_49;
    String destinationMember_50;
	long creationDate;
	long creationTime;
	long updateDate;
	long updateTime ;
	long validityDate;
	long validityTime;
	long status;
	String internals_SessionID;
	String internals_FlowID;
	long internals_ProcessStatus;
	String internals_ProcessStatusDescription;
	long internals_TransactionCreationTime;
	long internals_SentOnBusTime;
	long internals_TakenFromBusTime;
	long internals_ProcessedTime;
	long internals_SentBackToBusTime;
	long internals_TakenBackFromBusTime;
	long internals_CloseTransactionTime;
	String internals_TransactionID;

    public IntQuoteRequest() {}

    public IntQuoteRequest(
        String quoteRequestID,
        String clientQuoteRequestID,
        long mLegType,
        long type,
        String firstLegSecurityID,
        double firstLegPrice,
        double firstLegYield,
        double firstLegQuantity,
        double firstLegMinimumQty,
        long firstLegVerb,
        String firstLegMarketID,
        String secondLegSecurityID,
        double secondLegPrice,
        double secondLegYield,
        double secondLegQuantity,
        double secondLegMinimumQty,
        long secondLegVerb,
        String secondLegMarketID,
        String thirdLegSecurityID,
        double thirdLegPrice,
        double thirdLegYield,
        double thirdLegQuantity,
        double thirdLegMinimumQty,
        long thirdLegVerb,
        String thirdLegMarketID,
        String issuerMemberID,
        String issuerOperatorID,
        long numberOfDestinationMembers,
        String destinationMember_1,
        String destinationMember_2,
        String destinationMember_3,
        String destinationMember_4,
        String destinationMember_5,
        String destinationMember_6,
        String destinationMember_7,
        String destinationMember_8,
        String destinationMember_9,
        String destinationMember_10,
        String destinationMember_11,
        String destinationMember_12,
        String destinationMember_13,
        String destinationMember_14,
        String destinationMember_15,
        String destinationMember_16,
        String destinationMember_17,
        String destinationMember_18,
        String destinationMember_19,
        String destinationMember_20,
        String destinationMember_21,
        String destinationMember_22,
        String destinationMember_23,
        String destinationMember_24,
        String destinationMember_25,
        String destinationMember_26,
        String destinationMember_27,
        String destinationMember_28,
        String destinationMember_29,
        String destinationMember_30,
        String destinationMember_31,
        String destinationMember_32,
        String destinationMember_33,
        String destinationMember_34,
        String destinationMember_35,
        String destinationMember_36,
        String destinationMember_37,
        String destinationMember_38,
        String destinationMember_39,
        String destinationMember_40,
        String destinationMember_41,
        String destinationMember_42,
        String destinationMember_43,
        String destinationMember_44,
        String destinationMember_45,
        String destinationMember_46,
        String destinationMember_47,
        String destinationMember_48,
        String destinationMember_49,
        String destinationMember_50,
        long creationDate,
        long CreationTime,
        long updateDate,
        long updateTime ,
        long validityDate,
        long validityTime,
        long status,
        String internals_SessionID,
        String internals_FlowID,
        long internals_ProcessStatus,
        String internals_ProcessStatusDescription,
        long internals_TransactionCreationTime,
        long internals_SentOnBusTime,
        long internals_TakenFromBusTime,
        long internals_ProcessedTime,
        long internals_SentBackToBusTime,
        long internals_TakenBackFromBusTime,
        long internals_CloseTransactionTime,
        String internals_TransactionID
        ) {
            this.quoteRequestID=quoteRequestID;
            this.clientQuoteRequestID=clientQuoteRequestID;
            this.mLegType=mLegType;
            this.type=type;
            this.firstLegSecurityID=firstLegSecurityID;
            this.firstLegPrice=firstLegPrice;
            this.firstLegYield=firstLegYield;
            this.firstLegQuantity=firstLegQuantity;
            this.firstLegMinimumQty=firstLegMinimumQty;
            this.firstLegVerb=firstLegVerb;
            this.firstLegMarketID=firstLegMarketID;
            this.secondLegSecurityID=secondLegSecurityID;
            this.secondLegPrice=secondLegPrice;
            this.secondLegYield=secondLegYield;
            this.secondLegQuantity=secondLegQuantity;
            this.secondLegMinimumQty=secondLegMinimumQty;
            this.secondLegVerb=secondLegVerb;
            this.secondLegMarketID=secondLegMarketID;
            this.thirdLegSecurityID=thirdLegSecurityID;
            this.thirdLegPrice=thirdLegPrice;
            this.thirdLegYield=thirdLegYield;
            this.thirdLegQuantity=thirdLegQuantity;
            this.thirdLegMinimumQty=thirdLegMinimumQty;
            this.thirdLegVerb=thirdLegVerb;
            this.thirdLegMarketID=thirdLegMarketID;
            this.issuerMemberID=issuerMemberID;
            this.issuerOperatorID=issuerOperatorID;
            this.numberOfDestinationMembers=numberOfDestinationMembers;
            this.destinationMember_1=destinationMember_1;
            this.destinationMember_2=destinationMember_2;
            this.destinationMember_3=destinationMember_3;
            this.destinationMember_4=destinationMember_4;
            this.destinationMember_5=destinationMember_5;
            this.destinationMember_6=destinationMember_6;
            this.destinationMember_7=destinationMember_7;
            this.destinationMember_8=destinationMember_8;
            this.destinationMember_9=destinationMember_9;
            this.destinationMember_10=destinationMember_10;
            this.destinationMember_11=destinationMember_11;
            this.destinationMember_12=destinationMember_12;
            this.destinationMember_13=destinationMember_13;
            this.destinationMember_14=destinationMember_14;
            this.destinationMember_15=destinationMember_15;
            this.destinationMember_16=destinationMember_16;
            this.destinationMember_17=destinationMember_17;
            this.destinationMember_18=destinationMember_18;
            this.destinationMember_19=destinationMember_19;
            this.destinationMember_20=destinationMember_20;
            this.destinationMember_21=destinationMember_21;
            this.destinationMember_22=destinationMember_22;
            this.destinationMember_23=destinationMember_23;
            this.destinationMember_24=destinationMember_24;
            this.destinationMember_25=destinationMember_25;
            this.destinationMember_26=destinationMember_26;
            this.destinationMember_27=destinationMember_27;
            this.destinationMember_28=destinationMember_28;
            this.destinationMember_29=destinationMember_29;
            this.destinationMember_30=destinationMember_30;
            this.destinationMember_31=destinationMember_31;
            this.destinationMember_32=destinationMember_32;
            this.destinationMember_33=destinationMember_33;
            this.destinationMember_34=destinationMember_34;
            this.destinationMember_35=destinationMember_35;
            this.destinationMember_36=destinationMember_36;
            this.destinationMember_37=destinationMember_37;
            this.destinationMember_38=destinationMember_38;
            this.destinationMember_39=destinationMember_39;
            this.destinationMember_40=destinationMember_40;
            this.destinationMember_41=destinationMember_41;
            this.destinationMember_42=destinationMember_42;
            this.destinationMember_43=destinationMember_43;
            this.destinationMember_44=destinationMember_44;
            this.destinationMember_45=destinationMember_45;
            this.destinationMember_46=destinationMember_46;
            this.destinationMember_47=destinationMember_47;
            this.destinationMember_48=destinationMember_48;
            this.destinationMember_49=destinationMember_49;
            this.destinationMember_50=destinationMember_50;
            this.creationDate=creationDate;
            this.creationTime=CreationTime;
            this.updateDate=updateDate;
            this.updateTime =updateTime ;
            this.validityDate=validityDate;
            this.validityTime=validityTime;
            this.status=status;
            this.internals_SessionID=internals_SessionID;
            this.internals_FlowID=internals_FlowID;
            this.internals_ProcessStatus=internals_ProcessStatus;
            this.internals_ProcessStatusDescription=internals_ProcessStatusDescription;
            this.internals_TransactionCreationTime=internals_TransactionCreationTime;
            this.internals_SentOnBusTime=internals_SentOnBusTime;
            this.internals_TakenFromBusTime=internals_TakenFromBusTime;
            this.internals_ProcessedTime=internals_ProcessedTime;
            this.internals_SentBackToBusTime=internals_SentBackToBusTime;
            this.internals_TakenBackFromBusTime=internals_TakenBackFromBusTime;
            this.internals_CloseTransactionTime=internals_CloseTransactionTime;
            this.internals_TransactionID=internals_TransactionID;
    }

    public String getQuoteRequestID(){
        return this.quoteRequestID;
    }
    
    public String getClientQuoteRequestID(){
        return this.clientQuoteRequestID;
    }
    
    public long getMLegType(){
        return this.mLegType;
    }
    
    public long getType(){
        return this.type;
    }
    
    public String getFirstLegSecurityID(){
        return this.firstLegSecurityID;
    }
    
    public double getFirstLegPrice(){
        return this.firstLegPrice;
    }
    
    public double getFirstLegYield(){
        return this.firstLegYield;
    }
    
    public double getFirstLegQuantity(){
        return this.firstLegQuantity;
    }
    
    public double getFirstLegMinimumQty(){
        return this.firstLegMinimumQty;
    }
    
    public long getFirstLegVerb(){
        return this.firstLegVerb;
    }
    
    public String getFirstLegMarketID(){
        return this.firstLegMarketID;
    }
    
    public String getSecondLegSecurityID(){
        return this.secondLegSecurityID;
    }
    
    public double getSecondLegPrice(){
        return this.secondLegPrice;
    }
    
    public double getSecondLegYield(){
        return this.secondLegYield;
    }
    
    public double getSecondLegQuantity(){
        return this.secondLegQuantity;
    }
    
    public double getSecondLegMinimumQty(){
        return this.secondLegMinimumQty;
    }
    
    public long   getSecondLegVerb(){
        return this.secondLegVerb;
    }
    
    public String getSecondLegMarketID(){
        return this.secondLegMarketID;
    }
    
    public String getThirdLegSecurityID(){
        return this.thirdLegSecurityID;
    }
    
    public double getThirdLegPrice(){
        return this.thirdLegPrice;
    }
    
    public double getThirdLegYield(){
        return this.thirdLegYield;
    }
    
    public double getThirdLegQuantity(){
        return this.thirdLegQuantity;
    }
    
    public double getThirdLegMinimumQty(){
        return this.thirdLegMinimumQty;
    }
    
    public long   getThirdLegVerb(){
        return this.thirdLegVerb;
    }
    
    public String getThirdLegMarketID(){
        return this.thirdLegMarketID;
    }
    
    public String getIssuerMemberID(){
        return this.issuerMemberID;
    }
    
    public String getIssuerOperatorID(){
        return this.issuerOperatorID;
    }
    
    public long getNumberOfDestinationMembers(){
        return this.numberOfDestinationMembers;
    }
    
    public String getDestinationMember_1(){
        return this.destinationMember_1;
    }
    
    public String getDestinationMember_2(){
        return this.destinationMember_2;
    }
    
    public String getDestinationMember_3(){
        return this.destinationMember_3;
    }
    
    public String getDestinationMember_4(){
        return this.destinationMember_4;
    }
    
    public String getDestinationMember_5(){
        return this.destinationMember_5;
    }
    
    public String getDestinationMember_6(){
        return this.destinationMember_6;
    }
    
    public String getDestinationMember_7(){
        return this.destinationMember_7;
    }
    
    public String getDestinationMember_8(){
        return this.destinationMember_8;
    }
    
    public String getDestinationMember_9(){
        return this.destinationMember_9;
    }
    
    public String getDestinationMember_10(){
        return this.destinationMember_10;
    }
    
    public String getDestinationMember_11(){
        return this.destinationMember_11;
    }
    
    public String getDestinationMember_12(){
        return this.destinationMember_12;
    }
    
    public String getDestinationMember_13(){
        return this.destinationMember_13;
    }
    
    public String getDestinationMember_14(){
        return this.destinationMember_14;
    }
    
    public String getDestinationMember_15(){
        return this.destinationMember_15;
    }
    
    public String getDestinationMember_16(){
        return this.destinationMember_16;
    }
    
    public String getDestinationMember_17(){
        return this.destinationMember_17;
    }
    
    public String getDestinationMember_18(){
        return this.destinationMember_18;
    }
    
    public String getDestinationMember_19(){
        return this.destinationMember_19;
    }
    
    public String getDestinationMember_20(){
        return this.destinationMember_20;
    }
    
    public String getDestinationMember_21(){
        return this.destinationMember_21;
    }
    
    public String getDestinationMember_22(){
        return this.destinationMember_22;
    }
    
    public String getDestinationMember_23(){
        return this.destinationMember_23;
    }
    
    public String getDestinationMember_24(){
        return this.destinationMember_24;
    }
    
    public String getDestinationMember_25(){
        return this.destinationMember_25;
    }
    
    public String getDestinationMember_26(){
        return this.destinationMember_26;
    }
    
    public String getDestinationMember_27(){
        return this.destinationMember_27;
    }
    
    public String getDestinationMember_28(){
        return this.destinationMember_28;
    }
    
    public String getDestinationMember_29(){
        return this.destinationMember_29;
    }
    
    public String getDestinationMember_30(){
        return this.destinationMember_30;
    }
    
    public String getDestinationMember_31(){
        return this.destinationMember_31;
    }
    
    public String getDestinationMember_32(){
        return this.destinationMember_32;
    }
    
    public String getDestinationMember_33(){
        return this.destinationMember_33;
    }
    
    public String getDestinationMember_34(){
        return this.destinationMember_34;
    }
    
    public String getDestinationMember_35(){
        return this.destinationMember_35;
    }
    
    public String getDestinationMember_36(){
        return this.destinationMember_36;
    }
    
    public String getDestinationMember_37(){
        return this.destinationMember_37;
    }
    
    public String getDestinationMember_38(){
        return this.destinationMember_38;
    }
    
    public String getDestinationMember_39(){
        return this.destinationMember_39;
    }
    
    public String getDestinationMember_40(){
        return this.destinationMember_40;
    }
    
    public String getDestinationMember_41(){
        return this.destinationMember_41;
    }
    
    public String getDestinationMember_42(){
        return this.destinationMember_42;
    }
    
    public String getDestinationMember_43(){
        return this.destinationMember_43;
    }
    
    public String getDestinationMember_44(){
        return this.destinationMember_44;
    }
    
    public String getDestinationMember_45(){
        return this.destinationMember_45;
    }
    
    public String getDestinationMember_46(){
        return this.destinationMember_46;
    }
    
    public String getDestinationMember_47(){
        return this.destinationMember_47;
    }
    
    public String getDestinationMember_48(){
        return this.destinationMember_48;
    }
    
    public String getDestinationMember_49(){
        return this.destinationMember_49;
    }
    
    public String getDestinationMember_50(){
        return this.destinationMember_50;
    }
    
    public long getCreationDate(){
        return this.creationDate;
    }
    
    public long getCreationTime(){
        return this.creationTime;
    }
    
    public long getUpdateDate(){
        return this.updateDate;
    }
    
    public long getUpdateTime() {
        return this.updateTime;
    }
    
    public long getValidityDate(){
        return this.validityDate;
    }
    
    public long getValidityTime(){
        return this.validityTime;
    }
    
    public long getStatus(){
        return this.status;
    }
    
    public String getInternalsSessionID(){
        return this.internals_SessionID;
    }
    
    public String getInternalsFlowID(){
        return this.internals_FlowID;
    }
    
    public long getInternals_ProcessStatus(){
        return this.internals_ProcessStatus;
    }
    
    public String getInternals_ProcessStatusDescription(){
        return this.internals_ProcessStatusDescription;
    }
    
    public long getInternals_TransactionCreationTime(){
        return this.internals_TransactionCreationTime;
    }
    
    public long getInternals_SentOnBusTime(){
        return this.internals_SentOnBusTime;
    }
    
    public long getInternals_TakenFromBusTime(){
        return this.internals_TakenFromBusTime;
    }
    
    public long getInternals_ProcessedTime(){
        return this.internals_ProcessedTime;
    }
    
    public long getInternals_SentBackToBusTime(){
        return this.internals_SentBackToBusTime;
    }
    
    public long getInternals_TakenBackFromBusTime(){
        return this.internals_TakenBackFromBusTime;
    }
    
    public long getInternals_CloseTransactionTime(){
        return this.internals_CloseTransactionTime;
    }
    
    public String getInternals_TransactionID(){
        return this.internals_TransactionID;
    }

    public void setQuoteRequestID(String quoteRequestID){
        this.quoteRequestID=quoteRequestID;
    }
    
    public void setClientQuoteRequestID(String clientQuoteRequestID){
        this.clientQuoteRequestID=clientQuoteRequestID;
    }
    
    public void setMLegType(long mLegType){
        this.mLegType=mLegType;
    }
    
    public void setType(long type){
        this.type=type;
    }
    
    public void setFirstLegSecurityID(String firstLegSecurityID){
        this.firstLegSecurityID=firstLegSecurityID;
    }
    
    public void setFirstLegPrice(double firstLegPrice){
        this.firstLegPrice=firstLegPrice;
    }
    
    public void setFirstLegYield(double firstLegYield){
        this.firstLegYield=firstLegYield;
    }
    
    public void setFirstLegQuantity(double firstLegQuantity){
        this.firstLegQuantity=firstLegQuantity;
    }
    
    public void setFirstLegMinimumQty(double firstLegMinimumQty){
        this.firstLegMinimumQty=firstLegMinimumQty;
    }
    
    public  void setFirstLegVerb(long firstLegVerb){
        this.firstLegVerb=firstLegVerb;
    }
    
    public void setFirstLegMarketID(String firstLegMarketID){
        this.firstLegMarketID=firstLegMarketID;
    }
    
    public void setSecondLegSecurityID(String secondLegSecurityID){
        this.secondLegSecurityID=secondLegSecurityID;
    }
    
    public void setSecondLegPrice(double secondLegPrice){
        this.secondLegPrice=secondLegPrice;
    }
    
    public void setSecondLegYield(double secondLegYield){
        this.secondLegYield=secondLegYield;
    }
    
    public void setSecondLegQuantity(double secondLegQuantity){
        this.secondLegQuantity=secondLegQuantity;
    }
    
    public void setSecondLegMinimumQty(double secondLegMinimumQty){
        this.secondLegMinimumQty=secondLegMinimumQty;
    }
    
    public void setSecondLegVerb(long secondLegVerb){
        this.secondLegVerb=secondLegVerb;
    }
    
    public void setSecondLegMarketID(String secondLegMarketID){
        this.secondLegMarketID=secondLegMarketID;
    }
    
    public void setThirdLegSecurityID(String thirdLegSecurityID){
        this.thirdLegSecurityID=thirdLegSecurityID;
    }
    
    public void setThirdLegPrice(double thirdLegPrice){
        this.thirdLegPrice=thirdLegPrice;
    }
    
    public void setThirdLegYield(double thirdLegYield){
        this.thirdLegYield=thirdLegYield;
    }
    
    public void setThirdLegQuantity(double thirdLegQuantity){
        this.thirdLegQuantity=thirdLegQuantity;
    }
    
    public void setThirdLegMinimumQty(double thirdLegMinimumQty){
        this.thirdLegMinimumQty=thirdLegMinimumQty;
    }
    
    public void setThirdLegVerb(long thirdLegVerb){
        this.thirdLegVerb=thirdLegVerb;
    }
    
    public void setThirdLegMarketID(String thirdLegMarketID){
        this.thirdLegMarketID=thirdLegMarketID;
    }
    
    public void setIssuerMemberID(String issuerMemberID){
        this.issuerMemberID=issuerMemberID;
    }
    
    public void setIssuerOperatorID(String issuerOperatorID){
        this.issuerOperatorID=issuerOperatorID;
    }
    
    public void setNumberOfDestinationMembers(long numberOfDestinationMembers){
        this.numberOfDestinationMembers=numberOfDestinationMembers;
    }
    
    public void setDestinationMember_1(String destinationMember_1){
        this.destinationMember_1=destinationMember_1;
    }
    
    public void setDestinationMember_2(String destinationMember_2){
        this.destinationMember_2=destinationMember_2;
    }
    
    public void setDestinationMember_3(String destinationMember_3){
        this.destinationMember_3=destinationMember_3;
    }
    
    public void setDestinationMember_4(String destinationMember_4){
        this.destinationMember_4=destinationMember_4;
    }
    
    public void setDestinationMember_5(String destinationMember_5){
        this.destinationMember_5=destinationMember_5;
    }
    
    public void setDestinationMember_6(String destinationMember_6){
        this.destinationMember_6=destinationMember_6;
    }
    
    public void setDestinationMember_7(String destinationMember_7){
        this.destinationMember_7=destinationMember_7;
    }
    
    public void setDestinationMember_8(String destinationMember_8){
        this.destinationMember_8=destinationMember_8;
    }
    
    public void setDestinationMember_9(String destinationMember_9){
        this.destinationMember_9=destinationMember_9;
    }
    
    public void setDestinationMember_10(String destinationMember_10){
        this.destinationMember_10=destinationMember_10;
    }
    
    public void setDestinationMember_11(String destinationMember_11){
        this.destinationMember_11=destinationMember_11;
    }
    
    public void setDestinationMember_12(String destinationMember_12){
        this.destinationMember_12=destinationMember_12;
    }
    
    public void setDestinationMember_13(String destinationMember_13){
        this.destinationMember_13=destinationMember_13;
    }
    
    public void setDestinationMember_14(String destinationMember_14){
        this.destinationMember_14=destinationMember_14;
    }
    
    public void setDestinationMember_15(String destinationMember_15){
        this.destinationMember_15=destinationMember_15;
    }
    
    public void setDestinationMember_16(String destinationMember_16){
        this.destinationMember_16=destinationMember_16;
    }
    
    public void setDestinationMember_17(String destinationMember_17){
        this.destinationMember_17=destinationMember_17;
    }
    
    public void setDestinationMember_18(String destinationMember_18){
        this.destinationMember_18=destinationMember_18;
    }
    
    public void setDestinationMember_19(String destinationMember_19){
        this.destinationMember_19=destinationMember_19;
    }
    
    public void setDestinationMember_20(String destinationMember_20){
        this.destinationMember_20=destinationMember_20;
    }
    
    public void setDestinationMember_21(String destinationMember_21){
        this.destinationMember_21=destinationMember_21;
    }
    
    public void setDestinationMember_22(String destinationMember_22){
        this.destinationMember_22=destinationMember_22;
    }
    
    public void setDestinationMember_23(String destinationMember_23){
        this.destinationMember_23=destinationMember_23;
    }
    
    public void setDestinationMember_24(String destinationMember_24){
        this.destinationMember_24=destinationMember_24;
    }
    
    public void setDestinationMember_25(String destinationMember_25){
        this.destinationMember_25=destinationMember_25;
    }
    
    public void setDestinationMember_26(String destinationMember_26){
        this.destinationMember_26=destinationMember_26;
    }
    
    public void setDestinationMember_27(String destinationMember_27){
        this.destinationMember_27=destinationMember_27;
    }
    
    public void setDestinationMember_28(String destinationMember_28){
        this.destinationMember_28=destinationMember_28;
    }
    
    public void setDestinationMember_29(String destinationMember_29){
        this.destinationMember_29=destinationMember_29;
    }
    
    public void setDestinationMember_30(String destinationMember_30){
        this.destinationMember_30=destinationMember_30;
    }
    
    public void setDestinationMember_31(String destinationMember_31){
        this.destinationMember_31=destinationMember_31;
    }
    
    public void setDestinationMember_32(String destinationMember_32){
        this.destinationMember_32=destinationMember_32;
    }
    
    public void setDestinationMember_33(String destinationMember_33){
        this.destinationMember_33=destinationMember_33;
    }
    
    public void setDestinationMember_34(String destinationMember_34){
        this.destinationMember_34=destinationMember_34;
    }
    
    public void setDestinationMember_35(String destinationMember_35){
        this.destinationMember_35=destinationMember_35;
    }
    
    public void setDestinationMember_36(String destinationMember_36){
        this.destinationMember_36=destinationMember_36;
    }
    
    public void setDestinationMember_37(String destinationMember_37){
        this.destinationMember_37=destinationMember_37;
    }
    
    public void setDestinationMember_38(String destinationMember_38){
        this.destinationMember_38=destinationMember_38;
    }
    
    public void setDestinationMember_39(String destinationMember_39){
        this.destinationMember_39=destinationMember_39;
    }
    
    public void setDestinationMember_40(String destinationMember_40){
        this.destinationMember_40=destinationMember_40;
    }
    
    public void setDestinationMember_41(String destinationMember_41){
        this.destinationMember_41=destinationMember_41;
    }
    
    public void setDestinationMember_42(String destinationMember_42){
        this.destinationMember_42=destinationMember_42;
    }
    
    public void setDestinationMember_43(String destinationMember_43){
        this.destinationMember_43=destinationMember_43;
    }
    
    public void setDestinationMember_44(String destinationMember_44){
        this.destinationMember_44=destinationMember_44;
    }
    
    public void setDestinationMember_45(String destinationMember_45){
        this.destinationMember_45=destinationMember_45;
    }
    
    public void setDestinationMember_46(String destinationMember_46){
        this.destinationMember_46=destinationMember_46;
    }
    
    public void setDestinationMember_47(String destinationMember_47){
        this.destinationMember_47=destinationMember_47;
    }
    
    public void setDestinationMember_48(String destinationMember_48){
        this.destinationMember_48=destinationMember_48;
    }
    
    public void setDestinationMember_49(String destinationMember_49){
        this.destinationMember_49=destinationMember_49;
    }
    
    public void setDestinationMember_50(String destinationMember_50){
        this.destinationMember_50=destinationMember_50;
    }
    
    public void setCreationDate(long creationDate){
        this.creationDate=creationDate;
    }
    
    public void setCreationTime(long creationTime){
        this.creationTime=creationTime;
    }
    
    public void setUpdateDate(long updateDate){
        this.updateDate=updateDate;
    }
    
    public void setUpdateTime(long updateTime) {
        this.updateTime=updateTime;
    }
    
    public void setValidityDate(long validityDate){
        this.validityDate=validityDate;
    }
    
    public void setValidityTime(long validityTime){
        this.validityTime=validityTime;
    }
    
    public void setStatus(long status){
        this.status=status;
    }
    
    public void setSessionID(String internals_SessionID){
        this.internals_SessionID=internals_SessionID;
    }
    
    public void setFlowID(String internals_FlowID){
        this.internals_FlowID=internals_FlowID;
    }
    
    public void setInternals_ProcessStatus(long internals_ProcessStatus){
        this.internals_ProcessStatus=internals_ProcessStatus;
    }
    
    public void setInternals_ProcessStatusDescription(String internals_ProcessStatusDescription){
        this.internals_ProcessStatusDescription=internals_ProcessStatusDescription;
    }
    
    public void setInternals_TransactionCreationTime(long internals_TransactionCreationTime){
        this.internals_TransactionCreationTime=internals_TransactionCreationTime;
    }
    
    public void setInternals_SentOnBusTime(long internals_SentOnBusTime){
        this.internals_SentOnBusTime=internals_SentOnBusTime;
    }
    
    public void setInternals_TakenFromBusTime(long internals_TakenFromBusTime){
        this.internals_TakenFromBusTime=internals_TakenFromBusTime;
    }
    
    public void setInternals_ProcessedTime(long internals_ProcessedTime){
        this.internals_ProcessedTime=internals_ProcessedTime;
    }
    
    public void setInternals_SentBackToBusTime(long internals_SentBackToBusTime){
        this.internals_SentBackToBusTime=internals_SentBackToBusTime;
    }
    
    public void setInternals_TakenBackFromBusTime(long internals_TakenBackFromBusTime){
        this.internals_TakenBackFromBusTime=internals_TakenBackFromBusTime;
    }
    
    public void setInternals_CloseTransactionTime(long internals_CloseTransactionTime){
        this.internals_CloseTransactionTime=internals_CloseTransactionTime;
    }
    
    public void setInternals_TransactionID(String internals_TransactionID){
        this.internals_TransactionID=internals_TransactionID;
    }

    public MarketQuoteRequest ToMarketQuoteRequest(){
        MarketQuoteRequest.Builder newMarketQuoteRequestBuilder = MarketQuoteRequest.newBuilder();

        if (this.quoteRequestID!= null){
            newMarketQuoteRequestBuilder.setQuoteRequestID(this.getQuoteRequestID());
        }

        if (this.clientQuoteRequestID!= null){
            newMarketQuoteRequestBuilder.setClientQuoteRequestID(this.getClientQuoteRequestID());
        }

        newMarketQuoteRequestBuilder.setMlegTypeValue((int)this.getMLegType());
        newMarketQuoteRequestBuilder.setTypeValue((int)this.getType());

        Market.MarketQuoteLeg.Builder firstLegBuilder= Market.MarketQuoteLeg.newBuilder();

        if (this.firstLegSecurityID!= null){
            firstLegBuilder.setSecurityID(this.getFirstLegSecurityID());
        }
        firstLegBuilder.setPrice(this.getFirstLegPrice());
        firstLegBuilder.setYield(this.getFirstLegYield());
        firstLegBuilder.setQuantity(this.getFirstLegQuantity());
        firstLegBuilder.setMinimumQty(this.getFirstLegMinimumQty());
        firstLegBuilder.setVerbValue((int)this.getFirstLegVerb());
        if (this.firstLegMarketID!= null){
            firstLegBuilder.setMarketID(this.getFirstLegMarketID());
        }

        newMarketQuoteRequestBuilder.setFirstLeg(firstLegBuilder);

        Market.MarketQuoteLeg.Builder secondLegBuilder= Market.MarketQuoteLeg.newBuilder();;
        
        if (this.secondLegSecurityID!= null){
            secondLegBuilder.setSecurityID(this.getSecondLegSecurityID());
        }
        secondLegBuilder.setPrice(this.getSecondLegPrice());
        secondLegBuilder.setYield(this.getSecondLegYield());
        secondLegBuilder.setQuantity(this.getSecondLegQuantity());
        secondLegBuilder.setMinimumQty(this.getSecondLegMinimumQty());
        secondLegBuilder.setVerbValue((int)this.getSecondLegVerb());
        if (this.secondLegMarketID!= null){
            secondLegBuilder.setMarketID(this.getSecondLegMarketID());
        }

        newMarketQuoteRequestBuilder.setSecondLeg(secondLegBuilder);

        Market.MarketQuoteLeg.Builder thirdLegBuilder= Market.MarketQuoteLeg.newBuilder();

        if (this.thirdLegSecurityID!= null){
            thirdLegBuilder.setSecurityID(this.getThirdLegSecurityID());
        }
        thirdLegBuilder.setPrice(this.getThirdLegPrice());
        thirdLegBuilder.setYield(this.getThirdLegYield());
        thirdLegBuilder.setQuantity(this.getThirdLegQuantity());
        thirdLegBuilder.setMinimumQty(this.getThirdLegMinimumQty());
        thirdLegBuilder.setVerbValue((int)this.getThirdLegVerb());
        if (this.thirdLegMarketID!= null){
            thirdLegBuilder.setMarketID(this.getThirdLegMarketID());
        }

        newMarketQuoteRequestBuilder.setThirdLeg(thirdLegBuilder);
        
        if (this.issuerMemberID!= null){
            newMarketQuoteRequestBuilder.setIssuerMemberID(this.getIssuerMemberID());
        }

        if (this.issuerOperatorID!= null){
            newMarketQuoteRequestBuilder.setIssuerOperatorID(this.getIssuerOperatorID());
        }

        newMarketQuoteRequestBuilder.setNumberOfDestinationMembers((int)this.getNumberOfDestinationMembers());

        if (this.destinationMember_1 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(1, this.getDestinationMember_1());
        }
        if (this.destinationMember_2 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(2, this.getDestinationMember_2());
        }        
        if (this.destinationMember_3 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(3, this.getDestinationMember_3());
        }        
        if (this.destinationMember_4 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(4, this.getDestinationMember_4());
        }        
        if (this.destinationMember_5 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(5, this.getDestinationMember_5());
        }        
        if (this.destinationMember_6 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(6, this.getDestinationMember_6());
        }        
        if (this.destinationMember_7 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(7, this.getDestinationMember_7());
        }        
        if (this.destinationMember_8 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(8, this.getDestinationMember_8());
        }        
        if (this.destinationMember_9 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(9, this.getDestinationMember_9());
        }        
        if (this.destinationMember_10 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(10, this.getDestinationMember_10());
        }        
        if (this.destinationMember_11 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(11, this.getDestinationMember_11());
        }        
        if (this.destinationMember_12!= null){
            newMarketQuoteRequestBuilder.setDestinationMember(12, this.getDestinationMember_12());
        }        
        if (this.destinationMember_13 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(13, this.getDestinationMember_13());
        }        
        if (this.destinationMember_14 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(14, this.getDestinationMember_14());
        }        
        if (this.destinationMember_15 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(15, this.getDestinationMember_15());
        }        
        if (this.destinationMember_16 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(16, this.getDestinationMember_16());
        }        
        if (this.destinationMember_17 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(17, this.getDestinationMember_17());
        }        
        if (this.destinationMember_18 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(18, this.getDestinationMember_18());
        }        
        if (this.destinationMember_19 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(19, this.getDestinationMember_19());
        }        
        if (this.destinationMember_20 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(20, this.getDestinationMember_20());
        }        
        if (this.destinationMember_21 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(1, this.getDestinationMember_21());
        }        
        if (this.destinationMember_22 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(22, this.getDestinationMember_22());
        }        
        if (this.destinationMember_23 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(23, this.getDestinationMember_23());
        }       
         if (this.destinationMember_24 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(24, this.getDestinationMember_24());
        }        
        if (this.destinationMember_25 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(25, this.getDestinationMember_25());
        }        
        if (this.destinationMember_26 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(26, this.getDestinationMember_26());
        }        
        if (this.destinationMember_27 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(27, this.getDestinationMember_27());
        }        
        if (this.destinationMember_28 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(28, this.getDestinationMember_28());
        }        
        if (this.destinationMember_29 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(29, this.getDestinationMember_29());
        }        
        if (this.destinationMember_30 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(30, this.getDestinationMember_30());
        }        
        if (this.destinationMember_31 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(31, this.getDestinationMember_31());
        }        
        if (this.destinationMember_32 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(32, this.getDestinationMember_32());
        }        
        if (this.destinationMember_33 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(33, this.getDestinationMember_33());
        }        
        if (this.destinationMember_34 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(34, this.getDestinationMember_34());
        }        
        if (this.destinationMember_35 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(35, this.getDestinationMember_35());
        }        
        if (this.destinationMember_36 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(36, this.getDestinationMember_36());
        }        
        if (this.destinationMember_37 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(37, this.getDestinationMember_37());
        }        
        if (this.destinationMember_38 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(38, this.getDestinationMember_38());
        }        
        if (this.destinationMember_39 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(39, this.getDestinationMember_39());
        }        
        if (this.destinationMember_40 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(40, this.getDestinationMember_4());
        }        
        if (this.destinationMember_41 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(41, this.getDestinationMember_41());
        }        
        if (this.destinationMember_42 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(42, this.getDestinationMember_42());
        }        
        if (this.destinationMember_43 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(43, this.getDestinationMember_43());
        }        
        if (this.destinationMember_44 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(44, this.getDestinationMember_44());
        }        
        if (this.destinationMember_45 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(45, this.getDestinationMember_45());
        }        
        if (this.destinationMember_46 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(46, this.getDestinationMember_46());
        }        
        if (this.destinationMember_47 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(47, this.getDestinationMember_47());
        }        
        if (this.destinationMember_48 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(48, this.getDestinationMember_48());
        }        
        if (this.destinationMember_49 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(49, this.getDestinationMember_49());
        }        
        if (this.destinationMember_50 != null){
            newMarketQuoteRequestBuilder.setDestinationMember(50, this.getDestinationMember_50());
        }

        newMarketQuoteRequestBuilder.setCreationDate(this.creationDate);
        newMarketQuoteRequestBuilder.setCreationTime(this.creationTime);
        newMarketQuoteRequestBuilder.setUpdateDate(this.updateDate);
        newMarketQuoteRequestBuilder.setUpdateTime(this.updateTime);
        newMarketQuoteRequestBuilder.setValidityDate(this.validityDate);
        newMarketQuoteRequestBuilder.setValidityTime(this.validityTime);
        newMarketQuoteRequestBuilder.setStatusValue((int)this.getStatus());

        Market.MarketInternalInfo.Builder internalInfoBuilder= Market.MarketInternalInfo.newBuilder();

        if (this.internals_SessionID != null){
            internalInfoBuilder.setSessionID(this.getInternalsSessionID());
        }

        if (this.internals_FlowID != null){
            internalInfoBuilder.setFlowID(this.getInternalsFlowID());
        }

        internalInfoBuilder.setProcessStatusValue((int)this.getInternals_ProcessStatus());

        if (this.internals_ProcessStatusDescription != null){
            internalInfoBuilder.setProcessStatusDescription(this.getInternals_ProcessStatusDescription());
        }

        internalInfoBuilder.setTransactionCreationTime(this.getInternals_TransactionCreationTime());
        internalInfoBuilder.setSentOnBusTime(this.getInternals_SentOnBusTime());
        internalInfoBuilder.setTakenFromBusTime(this.getInternals_TakenFromBusTime());
        internalInfoBuilder.setProcessedTime(this.getInternals_ProcessedTime());
        internalInfoBuilder.setSentBackToBusTime(this.getInternals_SentBackToBusTime());
        internalInfoBuilder.setTakenBackFromBusTime(this.getInternals_TakenBackFromBusTime());
        internalInfoBuilder.setCloseTransactionTime(this.getInternals_CloseTransactionTime());
 
        if (this.internals_TransactionID != null){
            internalInfoBuilder.setTransactionID(this.getInternals_TransactionID());
        }

        newMarketQuoteRequestBuilder.setInternals(internalInfoBuilder);

        MarketQuoteRequest newMarketQuoteRequest = newMarketQuoteRequestBuilder.build();

        return newMarketQuoteRequest;
    }
}
