package com.example.vanhung.androidwebservice;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by vanhung on 10/08/2015.
 */
public interface API {
    @GET("/weather")
    void getWeather(@Query("q") String cityName,
                    Callback<WeatherResponse> callback);
}
