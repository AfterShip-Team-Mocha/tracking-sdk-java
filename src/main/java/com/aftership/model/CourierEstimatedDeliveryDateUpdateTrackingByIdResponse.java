/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class CourierEstimatedDeliveryDateUpdateTrackingByIdResponse extends Resource {

    @SerializedName("estimated_delivery_date")
    private String estimatedDeliveryDate;

    @SerializedName("estimated_delivery_date_min")
    private String estimatedDeliveryDateMin;

    @SerializedName("estimated_delivery_date_max")
    private String estimatedDeliveryDateMax;

    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getEstimatedDeliveryDateMin() {
        return estimatedDeliveryDateMin;
    }

    public void setEstimatedDeliveryDateMin(String estimatedDeliveryDateMin) {
        this.estimatedDeliveryDateMin = estimatedDeliveryDateMin;
    }

    public String getEstimatedDeliveryDateMax() {
        return estimatedDeliveryDateMax;
    }

    public void setEstimatedDeliveryDateMax(String estimatedDeliveryDateMax) {
        this.estimatedDeliveryDateMax = estimatedDeliveryDateMax;
    }

}
