package com.bastian.indicadores.Indicators;

import com.bastian.indicadores.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Bastian on 07-12-2016.
 */

public class IndicatorInterceptor {

    public Indicators getInterceptor(){
        Retrofit intterceptor = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
                return null;
    }

}
