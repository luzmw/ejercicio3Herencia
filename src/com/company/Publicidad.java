package com.company;

public class Publicidad extends Contenido {
    protected String marca;

    public Publicidad(String nombre, String fecha, int cantidadDeLineas, String marca) {
        super(nombre, fecha, cantidadDeLineas);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String verDatos() {
        return super.verDatos()+" , " + marca;
    }
}
