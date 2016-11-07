package com.getmylocation.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")

/**
 * Created by Tosin Onikute on 10/10/16.
 */

public class Viewport {

    private Northeast_ northeast;
    private Southwest_ southwest;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The northeast
     */
    public Northeast_ getNortheast() {
        return northeast;
    }

    /**
     *
     * @param northeast
     * The northeast
     */
    public void setNortheast(Northeast_ northeast) {
        this.northeast = northeast;
    }

    /**
     *
     * @return
     * The southwest
     */
    public Southwest_ getSouthwest() {
        return southwest;
    }

    /**
     *
     * @param southwest
     * The southwest
     */
    public void setSouthwest(Southwest_ southwest) {
        this.southwest = southwest;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
