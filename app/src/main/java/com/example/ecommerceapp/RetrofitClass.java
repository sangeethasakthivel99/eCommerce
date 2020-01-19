package com.example.ecommerceapp;

import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

public class RetrofitClass {
    private static OkHttpClient client = new OkHttpClient.Builder().build();
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {

        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://demo7203549.mockable.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        return retrofit;
    }
}