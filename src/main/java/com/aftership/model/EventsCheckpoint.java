/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class EventsCheckpoint extends Resource {

  @SerializedName("code")
  private String code;

  @SerializedName("reason")
  private ReasonEventsCheckpoint reason;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ReasonEventsCheckpoint getReason() {
    return reason;
  }

  public void setReason(ReasonEventsCheckpoint reason) {
    this.reason = reason;
  }
}
