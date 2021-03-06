/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcParkedOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcParkedOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcParkedOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcParkedOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_RequestID_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParkedOrderID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_ParkedOrderID_set(swigCPtr, this, value);
  }

  public String getParkedOrderID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_ParkedOrderID_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_UserType_get(swigCPtr, this);
  }

  public void setStatus(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_Status_set(swigCPtr, this, value);
  }

  public char getStatus() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_Status_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_ErrorMsg_get(swigCPtr, this);
  }

  public void setIsSwapOrder(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_IsSwapOrder_set(swigCPtr, this, value);
  }

  public int getIsSwapOrder() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_IsSwapOrder_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_ClientID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmdapiJNI.CThostFtdcParkedOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcParkedOrderField() {
    this(thostmdapiJNI.new_CThostFtdcParkedOrderField(), true);
  }

}
