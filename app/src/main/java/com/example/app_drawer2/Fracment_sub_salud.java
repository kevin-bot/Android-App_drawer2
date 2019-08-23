package com.example.app_drawer2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_drawer2.Clases.RecyclerViewAdaptadorSalud;
import com.example.app_drawer2.Clases.Salud;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fracment_sub_salud extends Fragment {


    private RecyclerView recyclerView;
    private RecyclerViewAdaptadorSalud recyclerViewAdaptadorSalud;

    public Fracment_sub_salud() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fracment_sub_salud, container, false);

            recyclerView=view.findViewById(R.id.idrecyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            recyclerViewAdaptadorSalud = new RecyclerViewAdaptadorSalud(ObtenerSalud());
            recyclerView.setAdapter(recyclerViewAdaptadorSalud);

        return view;
    }

    public List<Salud> ObtenerSalud(){
        List<Salud> saludLista= new ArrayList<>();
        saludLista.add(new Salud("Este es el contenido ","Titulo",R.drawable.camera));
        saludLista.add(new Salud("Este es el segundo contenido ","Titulo",R.drawable.univalle));
        saludLista.add(new Salud("Este es el segundo contenido ","Titulo",R.drawable.imagen1));

        return saludLista;
    }

}
