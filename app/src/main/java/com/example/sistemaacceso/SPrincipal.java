package com.example.sistemaacceso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_principal);
    }

    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow,menu);
        return true;
    }

    public  boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id== R.id.Buscar){
            Toast.makeText(this,"Buscar",Toast.LENGTH_LONG).show();
        }else if (id== R.id.Compartir){
            Toast.makeText(this,"Compartir",Toast.LENGTH_LONG).show();
        }else if (id== R.id.Insertar){
            Toast.makeText(this,"Insertar",Toast.LENGTH_LONG).show();
        }else if (id== R.id.Modificar){
            Toast.makeText(this,"Modificar",Toast.LENGTH_LONG).show();
        }else if (id== R.id.Eliminar){
            Toast.makeText(this,"Eliminar",Toast.LENGTH_LONG).show();
        }else if (id== R.id.Closed){
            Intent siguiente = new Intent(SPrincipal.this,PaginaPrincipal.class);
            startActivity(siguiente);
            finish();
            Toast.makeText(this,"Seccion Cerrada",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}