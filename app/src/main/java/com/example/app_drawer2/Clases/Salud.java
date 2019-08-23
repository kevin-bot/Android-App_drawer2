package com.example.app_drawer2.Clases;

import android.widget.TextView;

public class Salud {

    private String Texto,Titulo;
    private int  Imagen;


    public Salud() {
    }

    public Salud(String texto, String titulo, int imagen) {
        Texto = texto;
        Titulo = titulo;
        Imagen = imagen;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
