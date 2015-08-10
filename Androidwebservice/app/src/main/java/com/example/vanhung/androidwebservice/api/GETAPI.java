package com.example.vanhung.androidwebservice.api;

import com.example.vanhung.androidwebservice.Model.QuestionManage;
import com.example.vanhung.androidwebservice.Model.WeatherResponse;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by vanhung on 10/08/2015.
 */
public interface GETAPI {
    @GET("/posts/{id_post}/questions")
    void getQuestion(@Path("id_post") Integer id,
                    Callback<QuestionManage> callback);
}
