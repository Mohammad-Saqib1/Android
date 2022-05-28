package com.saqib.myapplication.JavaClasses;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit=null;
    private static final String BASEURL="http://192.168.43.233/poetryapis/";

    public static Retrofit getRetrofit() {
        if(retrofit==null){
            OkHttpClient okHttpClient=new OkHttpClient.Builder().build();
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
