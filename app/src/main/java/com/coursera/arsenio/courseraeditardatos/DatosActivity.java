package com.coursera.arsenio.courseraeditardatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        Bundle parametros = getIntent().getExtras() ;
        ((TextView) findViewById(R.id.datos_nombre)).setText(parametros.getString(getResources().getString(R.string.par_nombre)));
        ((TextView) findViewById(R.id.datos_nacimiento)).setText(parametros.getString(getResources().getString(R.string.par_nacimiento)));
        ((TextView) findViewById(R.id.datos_telefono)).setText(parametros.getString(getResources().getString(R.string.par_telefono)));
        ((TextView) findViewById(R.id.datos_email)).setText(parametros.getString(getResources().getString(R.string.par_email)));
        ((TextView) findViewById(R.id.datos_descripcion)).setText(parametros.getString(getResources().getString(R.string.par_descripcion)));

        Button datos_btnEditar = findViewById(R.id.datos_btnEditar) ;
        datos_btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
