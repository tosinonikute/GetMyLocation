package com.getmylocation.singleton;

import com.getmylocation.Api;
import com.getmylocation.rest.MapsApi;

import retrofit.RestAdapter;

/**
 * Created by tosin onikute on 1/30/17.
 */

public class RestClient {

    private static MapsApi REST_CLIENT;
    private static String BASE_URL = Api.BASE_URL;

    public RestClient() {}

    public static MapsApi getInstance() {
        if (REST_CLIENT == null) {
            setupRestClient();
        }
        return REST_CLIENT;
    }


    private static void setupRestClient() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_URL)
                .build();
        REST_CLIENT = restAdapter.create(MapsApi.class);
    }

}
