/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class NextCouriersCreateTrackingRequest extends Resource {

    @SerializedName("slug")
    private String slug;

    @SerializedName("tracking_number")
    private String trackingNumber;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

}
