package com.example.app_drawer2.Clases;

public class ExitoAcademico {

    private String Texto,Titulo;
    private int  Imagen;


    public ExitoAcademico() {
    }

    public ExitoAcademico(String texto, String titulo, int imagen) {
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
}
