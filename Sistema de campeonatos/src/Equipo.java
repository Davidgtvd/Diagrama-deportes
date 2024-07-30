package com.tu_nombre_de_paquete.inscripcion;

import java.util.List;

public class Equipo extends Participante {
    private List<String> miembros;

    public Equipo(String nombre, List<String> miembros) {
        super(nombre);
        this.miembros = miembros;
    }

    public List<String> getMiembros() {
        return miembros;
    }

    @Override
    public String toString() {
        return "Equipo: " + getNombre() + " - Miembros: " + miembros;
    }
}
