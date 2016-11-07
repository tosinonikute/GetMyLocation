package com.getmylocation.model;




import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")

/**
 * Created by Tosin Onikute on 10/10/16.
 */

public class Geometry {

    private Bounds bounds;
    private Location location;
    @SerializedName("location_type")
    private String locationType;
    private Viewport viewport;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The bounds
     */
    public Bounds getBounds() {
        return bounds;
    }

    /**
     *
     * @param bounds
     * The bounds
     */
    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    /**
     *
     * @return
     * The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The locationType
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     *
     * @param locationType
     * The location_type
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     *
     * @return
     * The viewport
     */
    public Viewport getViewport() {
        return viewport;
    }

    /**
     *
     * @param viewport
     * The viewport
     */
    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
