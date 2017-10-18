package com.rosinante24.statistikgempa.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Rosinante24 on 18/10/17.
 */

public class InitRetrofit {

    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl("http://bachors.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getInstances() {
        return setInit().create(ApiServices.class);
    }

}
