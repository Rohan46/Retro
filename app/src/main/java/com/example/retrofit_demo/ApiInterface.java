package com.example.retrofit_demo;

import com.example.retrofit_demo.model.Data;
import com.example.retrofit_demo.model.Result;
import com.example.retrofit_demo.web_service.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET(API.GET_LIST_BY_CATEGORY_KEY)
    Call<Data> getbankData(@Query("category_key") String category_key);

    @GET(API.CITY)
    Call<Data> getcitydata(@Query("category_key") String category_key);



}
