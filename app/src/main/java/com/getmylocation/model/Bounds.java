package com.getmylocation.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")

/**
 * Created by Tosin Onikute on 10/10/16.
 */

public class Bounds {

    private Northeast northeast;
    private Southwest southwest;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The northeast
     */
    public Northeast getNortheast() {
        return northeast;
    }

    /**
     *
     * @param northeast
     * The northeast
     */
    public void setNortheast(Northeast northeast) {
        this.northeast = northeast;
    }

    /**
     *
     * @return
     * The southwest
     */
    public Southwest getSouthwest() {
        return southwest;
    }

    /**
     *
     * @param southwest
     * The southwest
     */
    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
