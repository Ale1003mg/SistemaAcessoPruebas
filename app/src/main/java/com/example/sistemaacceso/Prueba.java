package com.example.sistemaacceso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

public class Prueba extends AppCompatActivity {

    private TableLayout tableLayout;
   private String[]header={"ID","Nombre","Apellido","Telefono"};
   private ArrayList<String[]> rows = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_prueba);
        tableLayout= (TableLayout)findViewById(R.id.Table);

        TableDynamic tableDynamic= new TableDynamic(tableLayout,getApplicationContext());
        tableDynamic.addHeader(header);
        tableDynamic.addData(getClientes());
    }

    private ArrayList<String[]>getClientes(){
        rows.add(new String[]{"1","Luis","Fernandez","22-15-30-40"});
        rows.add(new String[]{"2","Alejandro","Marin","22-88-90-50"});
        rows.add(new String[]{"3","Diego","Palma","22-15-75-89"});
        rows.add(new String[]{"4","Fernando","Perez","87-45-25-35"});
        rows.add(new String[]{"5","Natalia","Mendez","87-89-98-52"});
        rows.add(new String[]{"6","Katty","Varela","85-45-65-32"});
        return rows;
    }
}
