/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcBrokerUserPasswordField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerUserPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcBrokerUserPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcBrokerUserPasswordField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcBrokerUserPasswordField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmdapiJNI.CThostFtdcBrokerUserPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmdapiJNI.CThostFtdcBrokerUserPasswordField_Password_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserPasswordField() {
    this(thostmdapiJNI.new_CThostFtdcBrokerUserPasswordField(), true);
  }

}
