/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.courier;

import com.aftership.base.Fetcher;
import com.aftership.http.*;
import com.aftership.model.GetAllCouriersResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

public class GetAllCouriersFetcher extends Fetcher<GetAllCouriersResponse> {
    private final Map<String, String> headerParams = new HashMap<>(8);

    public GetAllCouriersFetcher addHeaderParam(final String name, final String value) {
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

    @Override
    public GetAllCouriersResponse fetch(AfterShipClient client) throws Exception {
        String path = "/tracking/2024-07/couriers/all";
        Request request = new Request(HttpMethod.GET, path);
        setHeaderParams(request);
        Response response = client.request(request);
        AfterShipResponse<GetAllCouriersResponse> trackingResponse = new Gson().fromJson(response.getContent(), new TypeToken<AfterShipResponse<GetAllCouriersResponse>>() {
        }.getType());
        return trackingResponse.getData();

    }

}