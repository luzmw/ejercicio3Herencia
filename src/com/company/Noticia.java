package com.company;

import java.util.Scanner;

public class Noticia extends Contenido{
    protected String autor;
    protected String titulo;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Noticia(String nombre, String fecha, int cantidadDeLineas, String autor, String titulo) {
        super(nombre, fecha, cantidadDeLineas);
        this.autor = autor;
        this.titulo= titulo;

    }
    @Override
    public String verDatos(){
        return super.verDatos()+" , "+ titulo+ " , " + autor;
    }




}



