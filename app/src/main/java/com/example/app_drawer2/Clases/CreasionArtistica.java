package com.example.app_drawer2.Clases;

import android.widget.ImageView;

public class CreasionArtistica {

    private String Texto,Titulo;
    private int  Imagen;
    //private ImageView Imagen;

    public CreasionArtistica() {
    }

    public CreasionArtistica(String texto, String titulo, int/*ImageView*/ imagen) {
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

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    /*public ImageView getImagen() {
        return Imagen;
    }

    public void setImagen(ImageView imagen) {
        Imagen = imagen;
    }*/
}
