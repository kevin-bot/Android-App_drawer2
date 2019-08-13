package com.example.app_drawer2.Fracmento;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.app_drawer2.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.jar.JarException;


public class fracmento_inicio extends Fragment {

    ViewFlipper vfContenedorIMG;
    ImageView imageView,imageView2;
    //int vfImagenes[]= null;
    public fracmento_inicio() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fracmento_inicio,container,false);


        TraerImagenJson("http://192.168.60.49/bienestar/consultarIMG.php");
        vfContenedorIMG=view.findViewById(R.id.idviewFlipper);
        imageView=view.findViewById(R.id.img_frac_princi_rotativas);
        imageView2=view.findViewById(R.id.img_frac_princi_rotativas2);

        int vfImagenes[]= {R.drawable.camera};

        for (int i=0;i<vfImagenes.length;i++){
            Llenar_ViewFlipper(vfImagenes[i]);
        }

        return view;
    }


    public void Llenar_ViewFlipper(int imagen){

        ImageView imageView= new ImageView(getContext());
        imageView.setBackgroundResource(imagen);

        vfContenedorIMG.addView(imageView);
        vfContenedorIMG.setFlipInterval(6000);
        vfContenedorIMG.setAutoStart(true);

        vfContenedorIMG.setInAnimation(getContext(),android.R.anim.slide_in_left);
        vfContenedorIMG.setOutAnimation(getContext(),android.R.anim.slide_out_right);



    }

    public void TraerImagenJson(String URL){
        JsonArrayRequest jsonArrayRequest=  new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject=null;
                for (int i=0;i<response.length();i++){
                    try {
                            jsonObject=response.getJSONObject(i);

                        imageView.setImageBitmap(Imagenesdejson(jsonObject.optString("ima")));




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
