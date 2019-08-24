package com.example.app_drawer2;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.app_drawer2.Clases.CreasionArtistica;
import com.example.app_drawer2.Clases.RecyclerViewAdaptadorArtistica;
import com.example.app_drawer2.Clases.RecyclerViewAdaptadorSalud;
import com.example.app_drawer2.Clases.Salud;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import static androidx.navigation.Navigation.findNavController;


/**
 * A simple {@link Fragment} subclass.
 */
public class fracment_artis_crea_cultu extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdaptadorArtistica recyclerViewAdaptadorArtistica;

    public fracment_artis_crea_cultu() {
        // Required empty public constructor
    }

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_fracment_artis_crea_cultu, container, false);


       /* BottomNavigationView navView = view.findViewById(R.id.nav_view);
        //mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        recyclerView=view.findViewById(R.id.idrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerViewAdaptadorArtistica = new RecyclerViewAdaptadorArtistica(ObteneArtisticas());
        recyclerView.setAdapter(recyclerViewAdaptadorArtistica);*/

        return view;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                     intent= new Intent(getContext(),MainActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_dashboard:
                    //mTextMessage.setText(R.string.title_dashboard);
                    //Toast.makeText(getContext(),"hola como ",Toast.LENGTH_LONG).show();x
                    //findNavController(view).navigate(R.id.idaction_idfracment_principal_bienestar_to_fracment_sub_salud);

                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };












    public List<CreasionArtistica> ObteneArtisticas(){
        List<CreasionArtistica> ArtisiticaLista= new ArrayList<>();
        ArtisiticaLista.add(new CreasionArtistica("Este es el contenido ","Titulo",R.drawable.camera));
        ArtisiticaLista.add(new CreasionArtistica("Este es el segundo contenido ","Titulo",R.drawable.univalle));
        ArtisiticaLista.add(new CreasionArtistica("Este es el segundo contenido ","Titulo",R.drawable.imagen1));
        return ArtisiticaLista;
    }
}
