package com.rosinante24.statistikgempa.Network;

import com.rosinante24.statistikgempa.POJO.PojoGempaDirasakan;
import com.rosinante24.statistikgempa.POJO.PojoGempaTerkini;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Rosinante24 on 18/10/17.
 */

public interface ApiServices {
    @GET("gempa")
    Call<PojoGempaTerkini> getGempaTerkini(

            @Query("view") String view
    );

    @GET("gempa")
    Call<PojoGempaDirasakan> getGempaDirasakan(

            @Query("view") String view
    );
}
