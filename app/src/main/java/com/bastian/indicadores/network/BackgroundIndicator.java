package com.bastian.indicadores.network;

import android.os.AsyncTask;

import com.bastian.indicadores.models.Indicator;
import com.bastian.indicadores.models.Wrapper;

import java.io.IOException;

import okhttp3.Interceptor;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by santo_000 on 07-12-2016.
 */

public class BackgroundIndicator extends AsyncTask<Void, Void, Wrapper> {


    @Override
    protected Wrapper doInBackground(Void... params) {
        Indicators indicators = new IndicatorInterceptor().getInterceptor();
        Call<Wrapper> call = indicators.getIndicator();

        try {
            Response<Wrapper> response = call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
