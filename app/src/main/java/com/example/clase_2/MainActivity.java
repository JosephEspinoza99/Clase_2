package com.example.clase_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btEnviar(View view){

       EditText txtNombre = (EditText) findViewById(R.id.Nombre);
        RadioButton rbMasc = (RadioButton)findViewById(R.id.Masculino);
        String genero;
        if (rbMasc.isChecked())
            genero ="Señor";
        else
            genero="Señorita";
        Toast.makeText(this.getApplicationContext(), "Hola"+ " " +genero+" "+txtNombre.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}