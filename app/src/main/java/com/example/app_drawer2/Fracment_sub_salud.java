package com.example.app_drawer2;


import android.os.Bundle;

import androidx.cardview.widget.CardView;
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

import static androidx.navigation.Navigation.findNavController;


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

        CardView cardViewfutbol=view.findViewById(R.id.idcardviewFutbol);
        CardView cardViewNatacion=view.findViewById(R.id.idcardviewNatacion);
        CardView cardViewvoleybol=view.findViewById(R.id.idcardviewVoleybol);
        CardView cardViewBaloncesto=view.findViewById(R.id.idcardviewBaloncesto);
        CardView cardViewtenisdemesa=view.findViewById(R.id.idcardviewtenis_de_mesa);
        CardView cardViewajedrez=view.findViewById(R.id.idcardviewAjedrez);
        CardView cardViewatletismo=view.findViewById(R.id.idcardviewAtletismo);
        CardView cardViewFutbolsala=view.findViewById(R.id.idcardviewFutbol_sala);

        cardViewfutbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_fragment_futbol);
            }
        });

        cardViewNatacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_fragmentNatacion);
            }
        });

        cardViewvoleybol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_fragmentVoleybol);
            }
        });

        cardViewBaloncesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_fragment_baloncesto);
            }
        });

        cardViewtenisdemesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_fragmentTenis_de_mesa);
            }
        });

        cardViewajedrez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_fragmentAjedrez);
            }
        });
            cardViewatletismo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_atletismo);
                }
            });
        cardViewFutbolsala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_fracment_sub_salud_to_futbol_sala);
            }
        });
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
