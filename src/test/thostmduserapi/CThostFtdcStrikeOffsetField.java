/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcStrikeOffsetField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcStrikeOffsetField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcStrikeOffsetField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcStrikeOffsetField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcStrikeOffsetField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcStrikeOffsetField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmdapiJNI.CThostFtdcStrikeOffsetField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmdapiJNI.CThostFtdcStrikeOffsetField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcStrikeOffsetField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcStrikeOffsetField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcStrikeOffsetField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcStrikeOffsetField_InvestorID_get(swigCPtr, this);
  }

  public void setOffset(double value) {
    thostmdapiJNI.CThostFtdcStrikeOffsetField_Offset_set(swigCPtr, this, value);
  }

  public double getOffset() {
    return thostmdapiJNI.CThostFtdcStrikeOffsetField_Offset_get(swigCPtr, this);
  }

  public void setOffsetType(char value) {
    thostmdapiJNI.CThostFtdcStrikeOffsetField_OffsetType_set(swigCPtr, this, value);
  }

  public char getOffsetType() {
    return thostmdapiJNI.CThostFtdcStrikeOffsetField_OffsetType_get(swigCPtr, this);
  }

  public CThostFtdcStrikeOffsetField() {
    this(thostmdapiJNI.new_CThostFtdcStrikeOffsetField(), true);
  }

}
