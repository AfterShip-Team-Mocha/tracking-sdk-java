/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class CustomEstimatedDeliveryDateUpdateTrackingByIdResponse extends Resource {

    @SerializedName("type")
    private String type;

    @SerializedName("datetime")
    private String datetime;

    @SerializedName("datetime_min")
    private String datetimeMin;

    @SerializedName("datetime_max")
    private String datetimeMax;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDatetimeMin() {
        return datetimeMin;
    }

    public void setDatetimeMin(String datetimeMin) {
        this.datetimeMin = datetimeMin;
    }

    public String getDatetimeMax() {
        return datetimeMax;
    }

    public void setDatetimeMax(String datetimeMax) {
        this.datetimeMax = datetimeMax;
    }

}
