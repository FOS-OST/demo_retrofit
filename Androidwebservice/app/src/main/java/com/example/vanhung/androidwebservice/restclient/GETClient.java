package com.example.vanhung.androidwebservice.restclient;

import com.example.vanhung.androidwebservice.api.GETAPI;

import retrofit.RestAdapter;

/**
 * Created by vanhung on 10/08/2015.
 */


    public class GETClient {

        private static GETAPI REST_CLIENT;
        private static String ROOT =
                "http://46.101.56.207/api";

        static {
            setupRestClient();
        }

        private GETClient() {}

        public static GETAPI get() {
            return REST_CLIENT;
        }

        private static void setupRestClient() {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(ROOT)
                    .build();
            REST_CLIENT = restAdapter.create(GETAPI.class);
        }
    }

