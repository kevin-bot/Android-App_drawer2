package com.example.app_drawer2.Fracmento;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.app_drawer2.R;

import static androidx.navigation.Navigation.findNavController;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fracment_principal_bienestar extends Fragment {
        private ImageView btnArte_cultu,btnDeprote_disca,btnExitoEstudiantil,btnProfesores_diversidad;

    public Fracment_principal_bienestar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fracment_principal_bienestar, container, false);

      /* btnArte_cultu=view.findViewById(R.id.btnArt_Cre_cultu);
        btnDeprote_disca=view.findViewById(R.id.btnDeporte_disc);
        btnExitoEstudiantil=view.findViewById(R.id.btnExitoAcademico);
        btnProfesores_diversidad=view.findViewById(R.id.btnProfe_diversidad);¨*/


       /* btnDeprote_disca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_idfracment_principal_bienestar_to_fracment_sub_salud);

            }
        });

        btnArte_cultu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_idfracment_principal_bienestar_to_fracment_artis_crea_cultu);
            }
        });
        btnExitoEstudiantil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController(view).navigate(R.id.idaction_idfracment_principal_bienestar_to_fracment_exito_academi_per);
            }
        });*/

        return view ;
    }

}
