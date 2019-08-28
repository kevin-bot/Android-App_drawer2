package com.example.app_drawer2;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.app_drawer2.Clases.CreasionArtistica;
import com.example.app_drawer2.Clases.RecyclerViewAdaptadorArtistica;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Canto extends Fragment {
        private TextView textViewTitulo;

        RecyclerView recyclerView;
        RecyclerViewAdaptadorArtistica recyclerViewAdaptadorArtistica;
        CreasionArtistica creasionArtistica;

    public Canto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_canto, container, false);
        //TraerImagenJson("http://192.168.1.102/bienestar/Deporte.php");

        recyclerView=view.findViewById(R.id.idrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerViewAdaptadorArtistica = new RecyclerViewAdaptadorArtistica(ObteneExitoAcademico());
        recyclerView.setAdapter(recyclerViewAdaptadorArtistica);


        return view;
    }
    public List<CreasionArtistica> ObteneExitoAcademico(){
        List<CreasionArtistica> ExitoAcademicoLista= new ArrayList<>();
        ExitoAcademicoLista.add(new CreasionArtistica("Este es el contenido ","Titulo",R.drawable.camera));
        ExitoAcademicoLista.add(new CreasionArtistica("Este es el segundo contenido ","Titulo",R.drawable.univalle));
        ExitoAcademicoLista.add(new CreasionArtistica("Este es el segundo contenido ","Titulo",R.drawable.imagen1));
        return ExitoAcademicoLista;
    }


    public void TraerImagenJson(String URL){
        JsonArrayRequest jsonArrayRequest=  new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject=null;
                //ImageView[] vectorimagenes={imageView2Publi,imageView2Publi,imageView3Publi};//ARRAY DE LA CANTIDAD DE INMAGENES QUE PUEDEN PASAR EL LA PANTALLA PRINCIPAL
                for (int i=0;i<response.length();i++){
                    try {

                        jsonObject=response.getJSONObject(i);

                        //vectorimagenes[i].setImageBitmap(Imagenesdejson(jsonObject.optString("ima")));
                       textViewTitulo.setText(jsonObject.optString("titulo"));



                    }catch(JSONException e){
                        Toast.makeText(getContext(),"ERROR RESPONSE",Toast.LENGTH_LONG).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue requestQueue= Volley.newRequestQueue(getContext());
        requestQueue.add(jsonArrayRequest);
    }

    public Bitmap Imagenesdejson(String dato){
        Bitmap imagen=null;

        try {
            byte [] bytecode= Base64.decode(dato,Base64.DEFAULT);
            imagen= BitmapFactory.decodeByteArray(bytecode,0,bytecode.length);
        }catch (Exception e){
            e.printStackTrace();
        }
        return imagen;
    }
}
