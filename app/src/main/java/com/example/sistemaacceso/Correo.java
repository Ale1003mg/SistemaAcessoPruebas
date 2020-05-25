package com.example.sistemaacceso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        para=(EditText)findViewById(R.id.TXTPara);
        Asunto=(EditText)findViewById(R.id.TXTAsunto);
        Detalle=(EditText)findViewById(R.id.TXTDetalle);
    }

    public void  Enviar(View view){
        String CorreoPara=para.getText().toString();
        String[] recipients = CorreoPara.split(",");
        String Asun= Asunto.getText().toString();
        String Deta=Detalle.getText().toString();

        //Correo version1
       // Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("mailto"+CorreoPara));
       // intent.putExtra(Intent.EXTRA_SUBJECT,Asun);
       // intent.putExtra(Intent.EXTRA_TEXT,Deta);
       // startActivity(intent);
        //Correo version 2
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT,Asun);
        intent.putExtra(Intent.EXTRA_TEXT,Deta);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an email client"));
        //
       //Toast.makeText(Correo.this,"Correo Enviado",Toast.LENGTH_SHORT).show();
      //  Limpiar();
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
