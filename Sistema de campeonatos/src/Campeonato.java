package com.tu_nombre_de_paquete.campeonato;

import com.tu_nombre_de_paquete.inscripcion.Inscripcion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campeonato {
    private String nombre;
    private List<Inscripcion> inscripciones;
    private Map<Inscripcion, Integer> tablaPosiciones;

    public Campeonato(String nombre) {
        this.nombre = nombre;
        this.inscripciones = new ArrayList<>();
        this.tablaPosiciones = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
        tablaPosiciones.put(inscripcion, 0);
    }

    public void registrarResultado(Inscripcion equipo1, int score1, Inscripcion equipo2, int score2) {
        if (score1 > score2) {
            tablaPosiciones.put(equipo1, tablaPosiciones.get(equipo1) + 3);
        } else if (score1 < score2) {
            tablaPosiciones.put(equipo2, tablaPosiciones.get(equipo2) + 3);
        } else {
            tablaPosiciones.put(equipo1, tablaPosiciones.get(equipo1) + 1);
            tablaPosiciones.put(equipo2, tablaPosiciones.get(equipo2) + 1);
        }
    }

    public void mostrarDetalles() {
        System.out.println("Campeonato: " + nombre);
        System.out.println("Tabla de posiciones:");
        for (Map.Entry<Inscripcion, Integer> entry : tablaPosiciones.entrySet()) {
            System.out.println(entry.getKey().getParticipante().getNombre() + ": " + entry.getValue() + " puntos");
        }
    }
}
