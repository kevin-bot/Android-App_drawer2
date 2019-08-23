package com.example.app_drawer2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_drawer2.Clases.CreasionArtistica;
import com.example.app_drawer2.Clases.ExitoAcademico;
import com.example.app_drawer2.Clases.RecyclerViewAdaptadorArtistica;
import com.example.app_drawer2.Clases.RecyclerViewAdaptadorExiAcademico;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fracment_exito_academi_per extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdaptadorExiAcademico recyclerViewAdaptadorExiAcademico;

    public fracment_exito_academi_per() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fracment_exito_academi_per, container, false);

        recyclerView=view.findViewById(R.id.idrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerViewAdaptadorExiAcademico = new RecyclerViewAdaptadorExiAcademico(ObteneExitoAcademico());
        recyclerView.setAdapter(recyclerViewAdaptadorExiAcademico);

        return view;
    }


    public List<ExitoAcademico> ObteneExitoAcademico(){
        List<ExitoAcademico> ExitoAcademicoLista= new ArrayList<>();
        ExitoAcademicoLista.add(new ExitoAcademico("Este es el contenido ","Titulo",R.drawable.camera));
        ExitoAcademicoLista.add(new ExitoAcademico("Este es el segundo contenido ","Titulo",R.drawable.univalle));
        ExitoAcademicoLista.add(new ExitoAcademico("Este es el segundo contenido ","Titulo",R.drawable.imagen1));
        return ExitoAcademicoLista;
    }
}
