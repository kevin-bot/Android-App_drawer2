package com.example.app_drawer2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Fracment_Bienestar extends Fragment {
    private EditText txtTitulo;
    private TextView txtTitulo2;

    public Fracment_Bienestar() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fracment__bienestar,container, false);
        txtTitulo=(EditText) view.findViewById(R.id.txtTitulo);
        txtTitulo2=(TextView) view.findViewById(R.id.txttexto);

        //txtTitulo2.setText("hola como estas");
        BuscarTituloBienestar("http://192.168.60.49/bienestar/consultar.php");

        return view;
    }

    public void  BuscarTituloBienestar(String URL){
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;

                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);

                        txtTitulo.setText(jsonObject.getString("titulo"));
                        txtTitulo2.setText(jsonObject.getString("titulo"));
                        //Toast.makeText(getContext(),"Es: "+jsonObject.getString("titulo"),Toast.LENGTH_LONG).show();


                    } catch (JSONException e) {
                        Toast.makeText(getContext(),"JSON="+e.getMessage(),Toast.LENGTH_LONG).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(),"RESPONS="+error.toString(),Toast.LENGTH_LONG).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(getContext());
        requestQueue.add(jsonArrayRequest);
    }

}
