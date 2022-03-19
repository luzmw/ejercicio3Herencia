package com.company;

public  abstract class Contenido {

        protected String nombre;
        protected String fecha;
        protected int cantidadDeLineas;

    public Contenido(String nombre, String fecha, int cantidadDeLineas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.cantidadDeLineas= cantidadDeLineas;
    }

        public String getNombre() {
        return nombre;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public String getFecha() {
        return fecha;
    }

        public void setFecha(String fecha) {
        this.fecha = fecha;
    }

        public int getCantidadDeLineas() {
        return cantidadDeLineas;
    }

        public void setCantidadDeLineas(int cantidadDeLineas) {
        this.cantidadDeLineas = cantidadDeLineas;
    }


    public  String verDatos() {
        return "Contenido{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", cantidadDeLineas=" + cantidadDeLineas +
                '}';
    }
}

