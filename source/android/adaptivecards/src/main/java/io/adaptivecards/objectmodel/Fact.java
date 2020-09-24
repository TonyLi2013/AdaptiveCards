/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class Fact {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Fact(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Fact obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_Fact(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Fact() {
    this(AdaptiveCardObjectModelJNI.new_Fact__SWIG_0(), true);
  }

  public Fact(String title, String value) {
    this(AdaptiveCardObjectModelJNI.new_Fact__SWIG_1(title, value), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.Fact_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.Fact_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetTitle() {
    return AdaptiveCardObjectModelJNI.Fact_GetTitle(swigCPtr, this);
  }

  public void SetTitle(String value) {
    AdaptiveCardObjectModelJNI.Fact_SetTitle(swigCPtr, this, value);
  }

  public String GetValue() {
    return AdaptiveCardObjectModelJNI.Fact_GetValue(swigCPtr, this);
  }

  public void SetValue(String value) {
    AdaptiveCardObjectModelJNI.Fact_SetValue(swigCPtr, this, value);
  }

  public DateTimePreparser GetTitleForDateParsing() {
    return new DateTimePreparser(AdaptiveCardObjectModelJNI.Fact_GetTitleForDateParsing(swigCPtr, this), true);
  }

  public DateTimePreparser GetValueForDateParsing() {
    return new DateTimePreparser(AdaptiveCardObjectModelJNI.Fact_GetValueForDateParsing(swigCPtr, this), true);
  }

  public void SetLanguage(String value) {
    AdaptiveCardObjectModelJNI.Fact_SetLanguage(swigCPtr, this, value);
  }

  public String GetLanguage() {
    return AdaptiveCardObjectModelJNI.Fact_GetLanguage(swigCPtr, this);
  }

  public static Fact Deserialize(ParseContext context, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.Fact_Deserialize(ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new Fact(cPtr, true);
  }

  public static Fact DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.Fact_DeserializeFromString(ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new Fact(cPtr, true);
  }

}
