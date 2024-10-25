/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.aftership.base.Resource;
import com.google.gson.annotations.SerializedName;

public class PaginationGetTrackingsResponse extends Resource {

    @SerializedName("total")
    private Integer total;

    @SerializedName("next_cursor")
    private String nextCursor;

    @SerializedName("has_next_page")
    private Boolean hasNextPage;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

}
