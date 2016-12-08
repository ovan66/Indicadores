package com.bastian.indicadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bastian.indicadores.models.Wrapper;
import com.bastian.indicadores.network.BackgroundIndicator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new GetIndicators().execute();

    }

    private class GetIndicators extends BackgroundIndicator {
        @Override
        protected void onPostExecute(Wrapper wrapper) {
            String uf = String.valueOf(wrapper.getUf().getValor());
            TextView ufTv = (TextView) findViewById(R.id.ufTv);
            ufTv.setText(uf);

            String dolar = String.valueOf(wrapper.getDolar().getValor());
            TextView dolarTv= (TextView) findViewById(R.id.dolaTv);
            dolarTv.setText(dolar);

            String ipc = String.valueOf(wrapper.getIpc().getValor());
            TextView ipcTv = (TextView) findViewById(R.id.ipcTv);
            ipcTv.setText(ipc);

        }
    }
}
