/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class OrderProcessingTimeEstimatedPickupEstimatedDeliveryDateRequest extends Resource {

  @SerializedName("unit")
  private String unit;

  @SerializedName("value")
  private Float value;

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }
}
