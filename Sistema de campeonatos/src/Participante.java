package com.tu_nombre_de_paquete.inscripcion;

public abstract class Participante {
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
