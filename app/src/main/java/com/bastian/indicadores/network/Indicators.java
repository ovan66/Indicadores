package com.bastian.indicadores.network;

import com.bastian.indicadores.models.Wrapper;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by santo_000 on 05-12-2016.
 */

public interface Indicators {

    @GET("api")
    Call<Wrapper> getIndicator();

}
