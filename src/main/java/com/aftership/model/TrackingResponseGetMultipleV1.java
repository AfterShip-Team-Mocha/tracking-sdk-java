/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class TrackingResponseGetMultipleV1 extends Resource {

    @SerializedName("meta")
    private MetaV1 meta;

    @SerializedName("data")
    private DataTrackingResponseGetMultipleV1 data;

    public MetaV1 getMeta() {
        return meta;
    }

    public void setMeta(MetaV1 meta) {
        this.meta = meta;
    }

    public DataTrackingResponseGetMultipleV1 getData() {
        return data;
    }

    public void setData(DataTrackingResponseGetMultipleV1 data) {
        this.data = data;
    }

}
