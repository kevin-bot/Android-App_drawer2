package com.example.app_drawer2.Clases;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_drawer2.R;

import java.util.List;

public class RecyclerViewAdaptadorArtistica extends RecyclerView.Adapter<RecyclerViewAdaptadorArtistica.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Texto,Titulo;
        ImageView imagen;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Texto=itemView.findViewById(R.id.id_texto);
            Titulo=itemView.findViewById(R.id.id_Titulo);
            imagen=itemView.findViewById(R.id.Img_uno);
        }
    }
    public List<CreasionArtistica> creasionArtisticas;

    public RecyclerViewAdaptadorArtistica(List<CreasionArtistica> ArtisiticaLista) {
        creasionArtisticas= ArtisiticaLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycle,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
          holder.Texto.setText(creasionArtisticas.get(position).getTexto());
        holder.Titulo.setText(creasionArtisticas.get(position).getTitulo());
          holder.imagen.setImageResource(creasionArtisticas.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return creasionArtisticas.size();
    }
}

