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
    private TextView textViewTitulo1,textViewTexto1,textViewTitulo2,textViewTexto2,textViewTitulo3,textViewTexto3,
            textViewTitulo4,textViewTexto4,textViewTitulo5,textViewTexto5,textViewTitulo6,textViewTexto6,textViewTitulo7,textViewTexto7,
            textViewTitulo8,textViewTexto8,textViewTitulo9,textViewTexto9,textViewTitulo10,textViewTexto10;

    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10;




    public Canto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_canto, container, false);

        textViewTitulo1=view.findViewById(R.id.Ctxt_titulo_actividad1);
        textViewTexto1=view.findViewById(R.id.Ctxt_texto_actividad1);
        imageView1=view.findViewById(R.id.Cimg_actividad1);

        textViewTitulo2=view.findViewById(R.id.Ctxt_titulo_actividadDos);
        textViewTexto2=view.findViewById(R.id.Ctxt_texto_actividadDos);
        imageView2=view.findViewById(R.id.Cimg_actividadDos);

        textViewTitulo3=view.findViewById(R.id.Ctxt_titulo_actividadTres);
        textViewTexto3=view.findViewById(R.id.Ctxt_texto_actividadTres);
        imageView3=view.findViewById(R.id.Cimg_actividadTres);

        textViewTitulo4=view.findViewById(R.id.Ctxt_titulo_actividadCuatro);
        textViewTexto4=view.findViewById(R.id.Ctxt_texto_actividadCuatro);
        imageView4=view.findViewById(R.id.Cimg_actividadCuatro);

        textViewTitulo5=view.findViewById(R.id.Ctxt_titulo_actividadCinco);
        textViewTexto5=view.findViewById(R.id.Ctxt_texto_actividadCinco);
        imageView5=view.findViewById(R.id.Cimg_actividadcinco);

        textViewTitulo6=view.findViewById(R.id.Ctxt_titulo_actividadsix);
        textViewTexto6=view.findViewById(R.id.Ctxt_texto_actividadSix);
        imageView6=view.findViewById(R.id.Cimg_actividadSix);

        textViewTitulo7=view.findViewById(R.id.Ctxt_titulo_actividad7);
        textViewTexto7=view.findViewById(R.id.Ctxt_texto_actividad7);
        imageView7=view.findViewById(R.id.Cimg_actividad7);

        textViewTitulo8=view.findViewById(R.id.Ctxt_titulo_actividad8);
        textViewTexto8=view.findViewById(R.id.Ctxt_texto_actividad8);
        imageView8=view.findViewById(R.id.Cimg_actividad8);

        textViewTitulo9=view.findViewById(R.id.Ctxt_titulo_actividad9);
        textViewTexto9=view.findViewById(R.id.Ctxt_texto_actividad9);
        imageView9=view.findViewById(R.id.Cimg_actividad9);

        textViewTitulo10=view.findViewById(R.id.Ctxt_titulo_actividad10);
        textViewTexto10=view.findViewById(R.id.Ctxt_texto_actividad10);
        imageView10=view.findViewById(R.id.Cimg_actividad10);



        TraerImagenJson("http://univalle.tuinvestigacion.com/app/jsn/Ccantojsn.php");
       // TraerImagenJson("http://univalle.tuinvestigacion.com/UniApp/Deporte.php");


        return view;
    }


    public void TraerImagenJson(String URL){

        JsonArrayRequest jsonArrayRequest=  new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject=null;

                ImageView[] vectorimagenes={imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10};//ARRAY DE LA CANTIDAD DE INMAGENES QUE PUEDEN PASAR EL LA PANTALLA PRINCIPAL
                TextView[] vectorTitulos={textViewTitulo1,textViewTitulo2,textViewTitulo3,textViewTitulo4,textViewTitulo5,textViewTitulo6,textViewTitulo7,textViewTitulo8,textViewTitulo9,textViewTitulo10};
                TextView[] vectorTexto={textViewTexto1,textViewTexto2,textViewTexto3,textViewTexto4,textViewTexto5,textViewTexto6,textViewTexto7,textViewTexto8,textViewTexto9,textViewTexto10};


                for (int i=0;i<response.length();i++){
                    try {

                        jsonObject=response.getJSONObject(i);
                        vectorimagenes[i].setImageBitmap(Imagenesdejson(jsonObject.optString("ima")));
                        vectorTitulos[i].setText(jsonObject.optString("titulo"));
                        vectorTexto[i].setText(jsonObject.optString("texto"));

                        //vectorimagenes[i].setImageBitmap(Imagenesdejson(jsonObject.optString("ima")));
                       //textViewTitulo.setText(jsonObject.optString("titulo"));
                        //imageView.setImageBitmap(Imagenesdejson(jsonObject.optString("ima")))

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
