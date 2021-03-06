/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcRspRepealField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcRspRepealField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspRepealField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcRspRepealField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRepealTimeInterval(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_RepealTimeInterval_set(swigCPtr, this, value);
  }

  public int getRepealTimeInterval() {
    return thostmdapiJNI.CThostFtdcRspRepealField_RepealTimeInterval_get(swigCPtr, this);
  }

  public void setRepealedTimes(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_RepealedTimes_set(swigCPtr, this, value);
  }

  public int getRepealedTimes() {
    return thostmdapiJNI.CThostFtdcRspRepealField_RepealedTimes_get(swigCPtr, this);
  }

  public void setBankRepealFlag(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankRepealFlag_set(swigCPtr, this, value);
  }

  public char getBankRepealFlag() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankRepealFlag_get(swigCPtr, this);
  }

  public void setBrokerRepealFlag(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BrokerRepealFlag_set(swigCPtr, this, value);
  }

  public char getBrokerRepealFlag() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BrokerRepealFlag_get(swigCPtr, this);
  }

  public void setPlateRepealSerial(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_PlateRepealSerial_set(swigCPtr, this, value);
  }

  public int getPlateRepealSerial() {
    return thostmdapiJNI.CThostFtdcRspRepealField_PlateRepealSerial_get(swigCPtr, this);
  }

  public void setBankRepealSerial(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankRepealSerial_set(swigCPtr, this, value);
  }

  public String getBankRepealSerial() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankRepealSerial_get(swigCPtr, this);
  }

  public void setFutureRepealSerial(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_FutureRepealSerial_set(swigCPtr, this, value);
  }

  public int getFutureRepealSerial() {
    return thostmdapiJNI.CThostFtdcRspRepealField_FutureRepealSerial_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmdapiJNI.CThostFtdcRspRepealField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmdapiJNI.CThostFtdcRspRepealField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmdapiJNI.CThostFtdcRspRepealField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcRspRepealField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmdapiJNI.CThostFtdcRspRepealField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmdapiJNI.CThostFtdcRspRepealField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmdapiJNI.CThostFtdcRspRepealField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmdapiJNI.CThostFtdcRspRepealField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmdapiJNI.CThostFtdcRspRepealField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmdapiJNI.CThostFtdcRspRepealField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmdapiJNI.CThostFtdcRspRepealField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_InstallID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return thostmdapiJNI.CThostFtdcRspRepealField_FutureSerial_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thostmdapiJNI.CThostFtdcRspRepealField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    thostmdapiJNI.CThostFtdcRspRepealField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return thostmdapiJNI.CThostFtdcRspRepealField_TradeAmount_get(swigCPtr, this);
  }

  public void setFutureFetchAmount(double value) {
    thostmdapiJNI.CThostFtdcRspRepealField_FutureFetchAmount_set(swigCPtr, this, value);
  }

  public double getFutureFetchAmount() {
    return thostmdapiJNI.CThostFtdcRspRepealField_FutureFetchAmount_get(swigCPtr, this);
  }

  public void setFeePayFlag(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_FeePayFlag_set(swigCPtr, this, value);
  }

  public char getFeePayFlag() {
    return thostmdapiJNI.CThostFtdcRspRepealField_FeePayFlag_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    thostmdapiJNI.CThostFtdcRspRepealField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return thostmdapiJNI.CThostFtdcRspRepealField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BrokerFee_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return thostmdapiJNI.CThostFtdcRspRepealField_Message_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmdapiJNI.CThostFtdcRspRepealField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return thostmdapiJNI.CThostFtdcRspRepealField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return thostmdapiJNI.CThostFtdcRspRepealField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thostmdapiJNI.CThostFtdcRspRepealField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_TID_get(swigCPtr, this);
  }

  public void setTransferStatus(char value) {
    thostmdapiJNI.CThostFtdcRspRepealField_TransferStatus_set(swigCPtr, this, value);
  }

  public char getTransferStatus() {
    return thostmdapiJNI.CThostFtdcRspRepealField_TransferStatus_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmdapiJNI.CThostFtdcRspRepealField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmdapiJNI.CThostFtdcRspRepealField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmdapiJNI.CThostFtdcRspRepealField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmdapiJNI.CThostFtdcRspRepealField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmdapiJNI.CThostFtdcRspRepealField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcRspRepealField() {
    this(thostmdapiJNI.new_CThostFtdcRspRepealField(), true);
  }

}
