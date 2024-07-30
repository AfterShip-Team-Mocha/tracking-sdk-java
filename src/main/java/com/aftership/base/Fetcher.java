/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.base;

import com.aftership.AfterShip;
import com.aftership.http.AfterShipClient;

public abstract class Fetcher<T extends Resource> {

    public T fetch() throws Exception {
        return fetch(AfterShip.getRestClient());
    }

    public abstract T fetch(final AfterShipClient client) throws Exception;
}