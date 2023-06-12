package com.example.clase_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btEnviar(View view ) {

        EditText txtNombre = findViewById(R.id.Nombre);
        RadioButton rbgenero = findViewById(R.id.Masculino);
        Switch rbnotificaciones = findViewById(R.id.Alertas);
        CalendarView calendarView = findViewById(R.id.calendarView);
        String genero;
        String nombre;
        String notificaciones;
        long fechaMillis = calendarView.getDate();

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fechaMillis);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        genero = rbgenero.isChecked() ? "Estimado" : "Estimada";
        nombre = txtNombre.getText().toString();
        notificaciones = rbnotificaciones.isChecked() ? "activadas" : "desactivadas";

        Intent intent = new Intent(MainActivity.this, Informacion.class);
        Bundle b = new Bundle();
        b.putInt("AÑO", year);
        b.putInt("MES", month);
        b.putInt("DIA", dayOfMonth);
        b.putString("NOMBRE", nombre);
        b.putString("GENERO", genero);
        b.putString("ALERTAS", notificaciones);
        intent.putExtras(b);
        startActivity(intent);
    }

//ASDASDASDSA
}