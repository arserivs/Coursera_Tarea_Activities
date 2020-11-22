package com.coursera.arsenio.courseraeditardatos;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText contacto_nacimiento = findViewById(R.id.contacto_nacimiento) ;
        contacto_nacimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fecha = new CalendarioFragment();
                ((CalendarioFragment) fecha).setearCampo(contacto_nacimiento);
                fecha.show(getSupportFragmentManager(),"Fecha de nacimiento");

            }
        });


        Button contacto_btnSiguiente = findViewById(R.id.contacto_btnSiguiente) ;
        contacto_btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DatosActivity.class) ;
                intent.putExtra(getResources().getString(R.string.par_nombre), ((EditText) findViewById(R.id.contacto_nombre)).getText().toString());
                intent.putExtra(getResources().getString(R.string.par_nacimiento), ((EditText) findViewById(R.id.contacto_nacimiento)).getText().toString());
                intent.putExtra(getResources().getString(R.string.par_telefono), ((EditText) findViewById(R.id.contacto_telefono)).getText().toString());
                intent.putExtra(getResources().getString(R.string.par_email), ((EditText) findViewById(R.id.contacto_email)).getText().toString());
                intent.putExtra(getResources().getString(R.string.par_descripcion), ((EditText) findViewById(R.id.contacto_descripcion)).getText().toString());

                startActivity(intent);

            }
        });
    }


    public static class CalendarioFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        private EditText campo = null;
        public void setearCampo(EditText campo) {
            this.campo = campo ;
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int yy = calendar.get(Calendar.YEAR);
            int mm = calendar.get(Calendar.MONTH);
            int dd = calendar.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(), this, yy, mm, dd);
        }

        public void onDateSet(DatePicker view, int yy, int mm, int dd) {
            populateSetDate(yy, mm+1, dd);
        }
        public void populateSetDate(int year, int month, int day) {


            this.campo.setText((day<10?"0":"")+ day+"/"+(month<10?"0":"")+month+"/"+year);
        }

    }
}
