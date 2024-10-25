/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.base;

import com.aftership.AfterShip;
import com.aftership.http.AfterShipClient;

public abstract class Updater<T extends Resource> {

    public T update() throws Exception {
        return update(AfterShip.getRestClient());
    }

    public abstract T update(final AfterShipClient client) throws Exception;
}
