/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;
import com.aftership.base.Resource;

public class NotificationResponseV1 extends Resource {

    @SerializedName("meta")
    private MetaV1 meta;

    @SerializedName("data")
    private DataNotificationResponseV1 data;

    public  MetaV1 getMeta() {
        return meta;
    }

    public void setMeta( MetaV1 meta) {
        this.meta = meta;
    }

    public  DataNotificationResponseV1 getData() {
        return data;
    }

    public void setData( DataNotificationResponseV1 data) {
        this.data = data;
    }

}