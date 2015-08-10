package com.example.vanhung.androidwebservice;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by vanhung on 10/08/2015.
 */


    public class RestClient {

        private static API REST_CLIENT;
        private static String ROOT =
                "http://api.openweathermap.org/data/2.5";

        static {
            setupRestClient();
        }

        private RestClient() {}

        public static API get() {
            return REST_CLIENT;
        }

        private static void setupRestClient() {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(ROOT)
                    .build();
            REST_CLIENT = restAdapter.create(API.class);
        }
    }

