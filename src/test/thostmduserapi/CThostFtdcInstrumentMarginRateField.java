/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcInstrumentMarginRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcInstrumentMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    thostmdapiJNI.CThostFtdcInstrumentMarginRateField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return thostmdapiJNI.CThostFtdcInstrumentMarginRateField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateField() {
    this(thostmdapiJNI.new_CThostFtdcInstrumentMarginRateField(), true);
  }

}