package com.example.ecommerceapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Endpoint {
    @GET("/getCategories")
    Call<List<Categories>> getAllCategories();

    @GET("/getPopularProducts")
    Call<List<PopularProducts>> getAllPopularProducts();
}
