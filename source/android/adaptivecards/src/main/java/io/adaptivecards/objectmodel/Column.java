/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class Column extends CollectionTypeElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Column(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.Column_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Column obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_Column(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Column() {
    this(AdaptiveCardObjectModelJNI.new_Column(), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.Column_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.Column_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static Column Deserialize(ParseContext context, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.Column_Deserialize(ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new Column(cPtr, true);
  }

  public static Column DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.Column_DeserializeFromString(ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new Column(cPtr, true);
  }

  public void DeserializeChildren(ParseContext context, JsonValue value) {
    AdaptiveCardObjectModelJNI.Column_DeserializeChildren(swigCPtr, this, ParseContext.getCPtr(context), context, JsonValue.getCPtr(value), value);
  }

  public String GetWidth() {
    return AdaptiveCardObjectModelJNI.Column_GetWidth(swigCPtr, this);
  }

  public void SetWidth(String value) {
    AdaptiveCardObjectModelJNI.Column_SetWidth(swigCPtr, this, value);
  }

  public int GetPixelWidth() {
    return AdaptiveCardObjectModelJNI.Column_GetPixelWidth(swigCPtr, this);
  }

  public void SetPixelWidth(int value) {
    AdaptiveCardObjectModelJNI.Column_SetPixelWidth(swigCPtr, this, value);
  }

  public BaseCardElementVector GetItems() {
    return new BaseCardElementVector(AdaptiveCardObjectModelJNI.Column_GetItems__SWIG_0(swigCPtr, this), false);
  }

  public void GetResourceInformation(RemoteResourceInformationVector resourceInfo) {
    AdaptiveCardObjectModelJNI.Column_GetResourceInformation(swigCPtr, this, RemoteResourceInformationVector.getCPtr(resourceInfo), resourceInfo);
  }

  public static Column dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.Column_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new Column(cPtr, true);
  }

}
