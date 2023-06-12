package com.example.clase_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        TextView txtSaludo = (TextView)findViewById(R.id.saludo);
        Bundle bundle  = this.getIntent().getExtras();
        txtSaludo.setText("Hola!, Bienvenido " +bundle.getString("GENERO")+" "
                +bundle.getString("NOMBRE")+"\n"+"\n"+"Las alertas estan "+bundle.getString("ALERTAS")+"\n"+"LA FECHA ES"+" "+bundle.getInt("DIA")+"/"+bundle.getInt("MES")+"/"+bundle.getInt("AÑO"));
    }
}