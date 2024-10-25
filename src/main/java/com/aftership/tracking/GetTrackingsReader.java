/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.tracking;

import com.aftership.base.Page;
import com.aftership.base.Reader;
import com.aftership.http.*;
import com.aftership.model.GetTrackingsResponse;
import com.aftership.model.Tracking;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

public class GetTrackingsReader extends Reader<Tracking> {
    private final Map<String, String> headerParams = new HashMap<>(8);
    private String cursor;
    private Integer limit;
    private String keyword;
    private String trackingNumbers;
    private String slug;
    private Integer transitTime;
    private String origin;
    private String destination;
    private String tag;
    private String createdAtMin;
    private String createdAtMax;
    private String updatedAtMin;
    private String updatedAtMax;
    private String fields;
    private String returnToSender;
    private String courierDestinationCountryIso3;
    private String shipmentTags;
    private String orderId;

    public GetTrackingsReader addHeaderParam(final String name, final String value) {
        if (value == null || value.equals("null")) {
            return this;
        }

        if (!headerParams.containsKey(name)) {
            headerParams.put(name, value);
        }
        return this;
    }

    private void setHeaderParams(final Request request) {
        for (final Map.Entry<String, String> entry : headerParams.entrySet()) {
            request.addHeaderParam(entry.getKey(), entry.getValue());
        }
    }

    public GetTrackingsReader setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public GetTrackingsReader setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public GetTrackingsReader setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public GetTrackingsReader setTrackingNumbers(String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
        return this;
    }

    public GetTrackingsReader setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public GetTrackingsReader setTransitTime(Integer transitTime) {
        this.transitTime = transitTime;
        return this;
    }

    public GetTrackingsReader setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public GetTrackingsReader setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public GetTrackingsReader setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public GetTrackingsReader setCreatedAtMin(String createdAtMin) {
        this.createdAtMin = createdAtMin;
        return this;
    }

    public GetTrackingsReader setCreatedAtMax(String createdAtMax) {
        this.createdAtMax = createdAtMax;
        return this;
    }

    public GetTrackingsReader setUpdatedAtMin(String updatedAtMin) {
        this.updatedAtMin = updatedAtMin;
        return this;
    }

    public GetTrackingsReader setUpdatedAtMax(String updatedAtMax) {
        this.updatedAtMax = updatedAtMax;
        return this;
    }

    public GetTrackingsReader setFields(String fields) {
        this.fields = fields;
        return this;
    }

    public GetTrackingsReader setReturnToSender(String returnToSender) {
        this.returnToSender = returnToSender;
        return this;
    }

    public GetTrackingsReader setCourierDestinationCountryIso3(String courierDestinationCountryIso3) {
        this.courierDestinationCountryIso3 = courierDestinationCountryIso3;
        return this;
    }

    public GetTrackingsReader setShipmentTags(String shipmentTags) {
        this.shipmentTags = shipmentTags;
        return this;
    }

    public GetTrackingsReader setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public Page<Tracking> read(AfterShipClient client) throws Exception {
        String path = "/tracking/2024-10/trackings";
        Request request = new Request(HttpMethod.GET, path);
        addQueryParams(request);
        setHeaderParams(request);
        Response response = client.request(request);
        AfterShipResponse<GetTrackingsResponse> trackingResponse = new Gson().fromJson(response.getContent(), new TypeToken<AfterShipResponse<GetTrackingsResponse>>() {
        }.getType());
        Page<Tracking> pageResponse = new Page<>();
        pageResponse.setNextCursor(trackingResponse.getData().getPagination().getNextCursor())
                .setHasNextCursor(trackingResponse.getData().getPagination().getHasNextPage())
                .setTotal(trackingResponse.getData().getPagination().getTotal())
                .setRecords(trackingResponse.getData().getTrackings());

        return pageResponse;
    }

    private void addQueryParams(final Request request) {
        if (cursor != null) {
            request.addQueryParam("cursor", cursor);
        }
        if (limit != null && limit > 0) {
            request.addQueryParam("limit", String.valueOf(limit));
        }
        if (keyword != null) {
            request.addQueryParam("keyword", keyword);
        }
        if (trackingNumbers != null) {
            request.addQueryParam("tracking_numbers", trackingNumbers);
        }
        if (slug != null) {
            request.addQueryParam("slug", slug);
        }
        if (transitTime != null && transitTime > 0) {
            request.addQueryParam("transit_time", String.valueOf(transitTime));
        }
        if (origin != null) {
            request.addQueryParam("origin", origin);
        }
        if (destination != null) {
            request.addQueryParam("destination", destination);
        }
        if (tag != null) {
            request.addQueryParam("tag", tag);
        }
        if (createdAtMin != null) {
            request.addQueryParam("created_at_min", createdAtMin);
        }
        if (createdAtMax != null) {
            request.addQueryParam("created_at_max", createdAtMax);
        }
        if (updatedAtMin != null) {
            request.addQueryParam("updated_at_min", updatedAtMin);
        }
        if (updatedAtMax != null) {
            request.addQueryParam("updated_at_max", updatedAtMax);
        }
        if (fields != null) {
            request.addQueryParam("fields", fields);
        }
        if (returnToSender != null) {
            request.addQueryParam("return_to_sender", returnToSender);
        }
        if (courierDestinationCountryIso3 != null) {
            request.addQueryParam("courier_destination_country_iso3", courierDestinationCountryIso3);
        }
        if (shipmentTags != null) {
            request.addQueryParam("shipment_tags", shipmentTags);
        }
        if (orderId != null) {
            request.addQueryParam("order_id", orderId);
        }

    }
}
