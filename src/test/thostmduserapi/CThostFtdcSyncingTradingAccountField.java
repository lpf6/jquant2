/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcSyncingTradingAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcSyncingTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setReserveBalance(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_set(swigCPtr, this, value);
  }

  public double getReserveBalance() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setPreFundMortgageIn(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageIn() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_get(swigCPtr, this);
  }

  public void setPreFundMortgageOut(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageOut() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageIn(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_set(swigCPtr, this, value);
  }

  public double getFundMortgageIn() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_get(swigCPtr, this);
  }

  public void setFundMortgageOut(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_set(swigCPtr, this, value);
  }

  public double getFundMortgageOut() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageAvailable(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_set(swigCPtr, this, value);
  }

  public double getFundMortgageAvailable() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_get(swigCPtr, this);
  }

  public void setMortgageableFund(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_set(swigCPtr, this, value);
  }

  public double getMortgageableFund() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_get(swigCPtr, this);
  }

  public void setSpecProductMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_get(swigCPtr, this);
  }

  public void setSpecProductFrozenMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_get(swigCPtr, this);
  }

  public void setSpecProductCommission(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductCommission() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_get(swigCPtr, this);
  }

  public void setSpecProductFrozenCommission(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenCommission() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_get(swigCPtr, this);
  }

  public void setSpecProductCloseProfit(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductCloseProfit() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfitByAlg(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfitByAlg() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_get(swigCPtr, this);
  }

  public void setSpecProductExchangeMargin(double value) {
    thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductExchangeMargin() {
    return thostmdapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingAccountField() {
    this(thostmdapiJNI.new_CThostFtdcSyncingTradingAccountField(), true);
  }

}