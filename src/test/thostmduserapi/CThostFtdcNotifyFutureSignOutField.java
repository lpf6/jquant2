/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcNotifyFutureSignOutField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcNotifyFutureSignOutField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNotifyFutureSignOutField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcNotifyFutureSignOutField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmdapiJNI.CThostFtdcNotifyFutureSignOutField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcNotifyFutureSignOutField() {
    this(thostmdapiJNI.new_CThostFtdcNotifyFutureSignOutField(), true);
  }

}
