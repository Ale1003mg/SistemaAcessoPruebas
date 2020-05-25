package com.example.sistemaacceso;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public  static  class  ViewHolder extends  RecyclerView.ViewHolder{

        private TextView Modelo,Nacionalidad;
        ImageView fotoModelo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Modelo=(TextView)itemView.findViewById(R.id.TextModelo);
            Nacionalidad=(TextView)itemView.findViewById(R.id.TextNacionalidad);
            fotoModelo=(ImageView)itemView.findViewById(R.id.ImagenModelo);

        }
    }

    public List<Modelos> ModelosLista;

    public RecyclerViewAdaptador(List<Modelos> modelosLista) {
        this.ModelosLista = modelosLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_modelos,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Modelo.setText(ModelosLista.get(position).getModelo());
        holder.Nacionalidad.setText(ModelosLista.get(position).getNacionalidad());
        holder.fotoModelo.setImageResource(ModelosLista.get(position).getFotoModelo());
    }

    public int getItemCount(){
        return ModelosLista.size();
    }
}
