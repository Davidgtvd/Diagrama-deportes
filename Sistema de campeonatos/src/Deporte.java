package com.tu_nombre_de_paquete.deporte;

public abstract class Deporte {
    private String nombre;

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarDetalles();
}
