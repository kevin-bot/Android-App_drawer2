package com.example.app_drawer2.Fracmento;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_drawer2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fracment_principal_bienestar extends Fragment {


    public Fracment_principal_bienestar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fracment_principal_bienestar, container, false);
    }

}
