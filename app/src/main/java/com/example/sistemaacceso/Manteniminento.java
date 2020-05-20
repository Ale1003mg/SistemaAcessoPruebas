package com.example.sistemaacceso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Manteniminento extends AppCompatActivity {


    public EditText ID,IDUs,Titulo,Descrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manteniminento);
        ID=(EditText)findViewById(R.id.ID);
        IDUs=(EditText)findViewById(R.id.IDUsu);
        Titulo=(EditText)findViewById(R.id.Titulo);
        Descrip=(EditText)findViewById(R.id.Descrip);
    }

    //Insert
    public  void  Insert(View view){
        //String SID=ID.getText().toString();
        final String SIDUsu=IDUs.getText().toString();
        final String STitulo=Titulo.getText().toString();
        final String SDescip=Descrip.getText().toString();

        //Inicio
        String url = "https://jsonplaceholder.typicode.com/posts";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(Manteniminento.this, "Se Guardo Correctamente", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Manteniminento.this,error.toString(),Toast.LENGTH_LONG).show();
            }
        }){protected Map<String,String> getParams() throws AuthFailureError{
            Map<String,String> parametros = new HashMap<String,String>();
            parametros.put("userId",SIDUsu);
            parametros.put("title",STitulo);
            parametros.put("body",SDescip);
            return parametros;
        }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        Limpiar();
        //Final
    }
    //Modificar
    public  void  Modificar(View view){
        //String SID=;
        final String SIDUsu=IDUs.getText().toString();
        final String STitulo=Titulo.getText().toString();
        final String SDescip=Descrip.getText().toString();

        String url = "https://jsonplaceholder.typicode.com/posts/"+ID.getText().toString();
        StringRequest stringRequest= new StringRequest(Request.Method.PUT, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Se modifico correctamente", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parameters = new HashMap<String, String>();
                parameters.put("userId",SIDUsu);
                parameters.put("title",STitulo);
                parameters.put("body",SDescip);

                return parameters;
            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

        Limpiar();
    }
    //Eliminar
    public  void  Eliminar(View view){
       // String SID=


            String url = "https://jsonplaceholder.typicode.com/posts/"+ID.getText().toString();
            StringRequest stringRequest= new StringRequest(Request.Method.DELETE, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Toast.makeText(getApplicationContext(), "El Producto fue eliminado", Toast.LENGTH_SHORT).show();
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
                }
            }
            ){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    return new HashMap<String, String>();
                }
            };

            RequestQueue requestQueue= Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

            Limpiar();
        }

    //Regresar
    public  void  Regresar(View view){
        Intent Regresar = new Intent(Manteniminento.this,SPrincipal.class);
        startActivity(Regresar);
        finish();
    }

    public void Limpiar(){
        ID.setText("");
        IDUs.setText("");
        Titulo.setText("");
        Descrip.setText("");
    }
}
