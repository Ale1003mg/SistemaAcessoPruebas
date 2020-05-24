package com.example.sistemaacceso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Correo extends AppCompatActivity {

    protected EditText de,para,Asunto,Detalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_correo);
        de=(EditText)findViewById(R.id.TXTDE);
        para=(EditText)findViewById(R.id.TXTPara);
        Asunto=(EditText)findViewById(R.id.TXTAsunto);
        Detalle=(EditText)findViewById(R.id.TXTDetalle);
    }

    public void  Enviar(View view){
        String CorreoDE= de.getText().toString();
        String CorreoPara=para.getText().toString();
        String Asun= Asunto.getText().toString();
        String Deta=Detalle.getText().toString();
        Toast.makeText(Correo.this,"Correo Enviado",Toast.LENGTH_SHORT).show();
        Limpiar();
    }

    public  void Regresar(View view){
        Intent returnar = new Intent(Correo.this,SPrincipal.class);
        startActivity(returnar);
        finish();
    }

    public  void Limpiar(){
        de.setText("");
        para.setText("");
        Asunto.setText("");
        Detalle.setText("");
    }
}
