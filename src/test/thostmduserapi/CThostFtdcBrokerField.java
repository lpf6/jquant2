/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcBrokerField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcBrokerField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcBrokerField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcBrokerField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerAbbr(String value) {
    thostmdapiJNI.CThostFtdcBrokerField_BrokerAbbr_set(swigCPtr, this, value);
  }

  public String getBrokerAbbr() {
    return thostmdapiJNI.CThostFtdcBrokerField_BrokerAbbr_get(swigCPtr, this);
  }

  public void setBrokerName(String value) {
    thostmdapiJNI.CThostFtdcBrokerField_BrokerName_set(swigCPtr, this, value);
  }

  public String getBrokerName() {
    return thostmdapiJNI.CThostFtdcBrokerField_BrokerName_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thostmdapiJNI.CThostFtdcBrokerField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thostmdapiJNI.CThostFtdcBrokerField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcBrokerField() {
    this(thostmdapiJNI.new_CThostFtdcBrokerField(), true);
  }

}
