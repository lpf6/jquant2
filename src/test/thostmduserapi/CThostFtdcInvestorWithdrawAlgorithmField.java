/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcInvestorWithdrawAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInvestorWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcInvestorWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return thostmdapiJNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public CThostFtdcInvestorWithdrawAlgorithmField() {
    this(thostmdapiJNI.new_CThostFtdcInvestorWithdrawAlgorithmField(), true);
  }

}
