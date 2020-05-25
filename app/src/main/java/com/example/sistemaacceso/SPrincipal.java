package com.example.sistemaacceso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
        }else if (id== R.id.Mantenimiento){
            Toast.makeText(this,"Mantenimiento",Toast.LENGTH_LONG).show();
            Intent Siguiente = new Intent(SPrincipal.this,Manteniminento.class);
            startActivity(Siguiente);
            finish();
        }else if (id== R.id.Videos){
            Toast.makeText(this,"Tablas",Toast.LENGTH_LONG).show();
            Intent Pruebas = new Intent(SPrincipal.this,Prueba.class);
            startActivity(Pruebas);
            //finish();
        }else if (id== R.id.Eliminar){
            Toast.makeText(this,"Correo",Toast.LENGTH_LONG).show();
            Intent Submenu = new Intent(SPrincipal.this,Correo.class);
            startActivity(Submenu);
            finish();
        }else if (id== R.id.Prueba){
            Toast.makeText(this,"Views",Toast.LENGTH_LONG).show();
            Intent Submenu = new Intent(SPrincipal.this,ViewCrossover.class);
            startActivity(Submenu);
            //finish();
        }else if (id== R.id.Closed){
            AlertDialog.Builder builder = new AlertDialog.Builder(SPrincipal.this);
            builder.setIcon(R.drawable.ic_warning_black_24dp).
                    //setIcon("ic_warning_black_24dp.xml").
                    setTitle("Desea salir").
                    setMessage("Se cerrara la aplicacion y tendra que ingresar las credenciales nuevamente.").
                    setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent siguiente = new Intent(SPrincipal.this,PaginaPrincipal.class);
                            startActivity(siguiente);
                            finish();
                            Toast.makeText(SPrincipal.this,"Seccion Cerrada",Toast.LENGTH_LONG).show();
                        }
                    }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SPrincipal.this,"Se cancelo",Toast.LENGTH_SHORT).show();
                }
            });
            AlertDialog alertDialog= builder.create();
            alertDialog.show();



        }
        return super.onOptionsItemSelected(item);
    }

}
