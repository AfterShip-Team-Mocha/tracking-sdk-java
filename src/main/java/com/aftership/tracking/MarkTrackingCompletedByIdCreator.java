/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.tracking;

import com.aftership.base.Creator;
import com.aftership.constant.ErrorEnum;
import com.aftership.exception.ApiException;
import com.aftership.http.*;
import com.aftership.model.MarkTrackingCompletedByIdRequest;
import com.aftership.model.Tracking;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

public class MarkTrackingCompletedByIdCreator extends Creator<Tracking> {
    private final Map<String, String> headerParams = new HashMap<>(8);
    private MarkTrackingCompletedByIdRequest markTrackingCompletedByIdRequest;
    private String id;

    public MarkTrackingCompletedByIdCreator addHeaderParam(final String name, final String value) {
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

    public MarkTrackingCompletedByIdCreator setMarkTrackingCompletedByIdRequest(MarkTrackingCompletedByIdRequest markTrackingCompletedByIdRequest) {
        this.markTrackingCompletedByIdRequest = markTrackingCompletedByIdRequest;
        return this;
    }

    public MarkTrackingCompletedByIdCreator setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public Tracking create(AfterShipClient client) throws Exception {
        if (id == null || id.isEmpty()) {
            throw new ApiException(ErrorEnum.BAD_REQUEST.getCode(), ErrorEnum.BAD_REQUEST.getMessage() + ": `id` is invalid");
        }
        String path = String.format("/tracking/2024-10/trackings/%s/mark-as-completed", id);
        Request request = new Request(HttpMethod.POST, path);
        request.setBody((new Gson()).toJson(markTrackingCompletedByIdRequest));

        setHeaderParams(request);
        Response response = client.request(request);
        AfterShipResponse<Tracking> trackingResponse = new Gson().fromJson(response.getContent(), new TypeToken<AfterShipResponse<Tracking>>() {
        }.getType());
        return trackingResponse.getData();

    }

}
