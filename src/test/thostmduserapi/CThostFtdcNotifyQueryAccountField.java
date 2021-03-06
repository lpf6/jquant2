/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcNotifyQueryAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcNotifyQueryAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNotifyQueryAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcNotifyQueryAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_Password_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_FutureSerial_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_TID_get(swigCPtr, this);
  }

  public void setBankUseAmount(double value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankUseAmount_set(swigCPtr, this, value);
  }

  public double getBankUseAmount() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankUseAmount_get(swigCPtr, this);
  }

  public void setBankFetchAmount(double value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankFetchAmount_set(swigCPtr, this, value);
  }

  public double getBankFetchAmount() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_BankFetchAmount_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmdapiJNI.CThostFtdcNotifyQueryAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmdapiJNI.CThostFtdcNotifyQueryAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcNotifyQueryAccountField() {
    this(thostmdapiJNI.new_CThostFtdcNotifyQueryAccountField(), true);
  }

}
