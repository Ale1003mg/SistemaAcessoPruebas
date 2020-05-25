package com.example.sistemaacceso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class ViewCrossover extends AppCompatActivity {

    private RecyclerView recyclerViewModelo;
    private  RecyclerViewAdaptador adaptadorModelo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_view_crossover);

        recyclerViewModelo=(RecyclerView)findViewById(R.id.ReModelos);
        recyclerViewModelo.setLayoutManager(new LinearLayoutManager(this));

        adaptadorModelo= new RecyclerViewAdaptador(ObtenerModelos());
        recyclerViewModelo.setAdapter(adaptadorModelo);
    }

    public List<Modelos> ObtenerModelos(){
        List<Modelos> modelos = new ArrayList<>();
        modelos.add(new Modelos("Prueba","Prueba",R.drawable._facebook_1456806566415));
        modelos.add(new Modelos("Prueba","Prueba",R.drawable._facebook_1457560311191));
        modelos.add(new Modelos("Prueba","Prueba",R.drawable._facebook_1457584091352));
        modelos.add(new Modelos("Prueba","Prueba",R.drawable._facebook_1457928359718));
        modelos.add(new Modelos("Prueba","Prueba",R.drawable._facebook_1458183735026));
        modelos.add(new Modelos("Prueba","Prueba",R.drawable._facebook_1458183778253));
        modelos.add(new Modelos("Prueba","Prueba",R.drawable._facebook_1458183789845));
        return modelos;

    }

}
