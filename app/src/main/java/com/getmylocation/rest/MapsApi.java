package com.getmylocation.rest;


import com.getmylocation.model.MapGoogleApis;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Hp on 27/09/2015.
 */

public interface MapsApi {

    /* Make maps request */
    @GET("/maps/api/geocode/json")
    public void getCurrentLocation(
            @Query("latlng") String latlng,
            @Query("key") String key,
            Callback<MapGoogleApis> response);


}
