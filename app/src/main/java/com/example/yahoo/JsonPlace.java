package com.example.yahoo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlace {
    @GET("weather")
    Call<Get> getGets(@Query("q") String q, @Query("units") String units, @Query("appid") String appid);
}
