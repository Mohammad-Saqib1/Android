package com.saqib.myapplication.Api;

import com.saqib.myapplication.getResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInstance {
    @GET("readApi.php")
         Call<getResponse> getpoetry();
}
