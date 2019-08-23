package com.example.app_drawer2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_drawer2.Clases.CreasionArtistica;
import com.example.app_drawer2.Clases.RecyclerViewAdaptadorArtistica;
import com.example.app_drawer2.Clases.RecyclerViewAdaptadorSalud;
import com.example.app_drawer2.Clases.Salud;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fracment_artis_crea_cultu extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdaptadorArtistica recyclerViewAdaptadorArtistica;

    public fracment_artis_crea_cultu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fracment_artis_crea_cultu, container, false);


        recyclerView=view.findViewById(R.id.idrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerViewAdaptadorArtistica = new RecyclerViewAdaptadorArtistica(ObteneArtisticas());
        recyclerView.setAdapter(recyclerViewAdaptadorArtistica);

        return view;
    }

    public List<CreasionArtistica> ObteneArtisticas(){
        List<CreasionArtistica> ArtisiticaLista= new ArrayList<>();
        ArtisiticaLista.add(new CreasionArtistica("Este es el contenido ","Titulo",R.drawable.camera));
        ArtisiticaLista.add(new CreasionArtistica("Este es el segundo contenido ","Titulo",R.drawable.univalle));
        ArtisiticaLista.add(new CreasionArtistica("Este es el segundo contenido ","Titulo",R.drawable.imagen1));
        return ArtisiticaLista;
    }
}
