package com.verus.drawroutes;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
    Call< Weather > getWeatherByCity(@Query("lat") Double lat, @Query("lon") Double lon);
}