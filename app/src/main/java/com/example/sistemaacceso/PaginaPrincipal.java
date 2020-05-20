package com.example.sistemaacceso;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PaginaPrincipal extends AppCompatActivity {

    public EditText Usuario,PAssword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        Usuario=(EditText)findViewById(R.id.Usu);
        PAssword=(EditText)findViewById(R.id.PW);

    }

    public  void  Ingresar(View view){
        String Cliente= Usuario.getText().toString();
        String Contraseña=PAssword.getText().toString();
        CSegundaria Logeo = new CSegundaria();
        Logeo.Obtener(Cliente,Contraseña);
       // int aux=Logeo.Loggeo();
        int aux=1;
        if (aux==1){
            Intent Siguiente = new Intent(this,SPrincipal.class);
            startActivity(Siguiente);
            finish();
        }else{
            Toast.makeText(PaginaPrincipal.this,"La Contraseña o el Password son incorrectos.",Toast.LENGTH_SHORT).show();
        }

    }
}
