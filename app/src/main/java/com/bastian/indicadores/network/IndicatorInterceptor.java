package com.bastian.indicadores.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Bastian on 07-12-2016.
 */

public class IndicatorInterceptor {

    private static final String BASE_URL = "http://mindicador.cl/";

    public Indicators getInterceptor() {
        Retrofit interceptor = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Indicators indicator = interceptor.create(Indicators.class);
        return indicator;
    }

}
