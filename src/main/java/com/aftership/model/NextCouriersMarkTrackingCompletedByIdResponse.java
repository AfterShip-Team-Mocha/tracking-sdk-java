/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class NextCouriersMarkTrackingCompletedByIdResponse extends Resource {

    @SerializedName("slug")
    private String slug;

    @SerializedName("tracking_number")
    private String trackingNumber;

    @SerializedName("source")
    private String source;

    @SerializedName("courier_tracking_link")
    private String courierTrackingLink;

    @SerializedName("courier_redirect_link")
    private String courierRedirectLink;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCourierTrackingLink() {
        return courierTrackingLink;
    }

    public void setCourierTrackingLink(String courierTrackingLink) {
        this.courierTrackingLink = courierTrackingLink;
    }

    public String getCourierRedirectLink() {
        return courierRedirectLink;
    }

    public void setCourierRedirectLink(String courierRedirectLink) {
        this.courierRedirectLink = courierRedirectLink;
    }

}
