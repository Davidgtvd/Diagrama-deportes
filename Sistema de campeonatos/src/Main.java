package com.tu_nombre_de_paquete.main;

import com.tu_nombre_de_paquete.campeonato.Campeonato;
import com.tu_nombre_de_paquete.campeonato.Liga;
import com.tu_nombre_de_paquete.deporte.DeporteEquipo;
import com.tu_nombre_de_paquete.inscripcion.Equipo;
import com.tu_nombre_de_paquete.inscripcion.Inscripcion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DeporteEquipo futbol = new DeporteEquipo("Fútbol", 11);
        DeporteEquipo baloncesto = new DeporteEquipo("Baloncesto", 5);

        Equipo equipo1 = new Equipo("Los Java", Arrays.asList("Jugador1", "Jugador2"));
        Equipo equipo2 = new Equipo("Los Python", Arrays.asList("Jugador3", "Jugador4")); // Mismo nombre, diferentes jugadores
        Equipo equipo3 = new Equipo("Los C++", Arrays.asList("Jugador5", "Jugador6"));

        Inscripcion inscripcion1 = new Inscripcion(equipo1);
        Inscripcion inscripcion2 = new Inscripcion(equipo2);
        Inscripcion inscripcion3 = new Inscripcion(equipo3);

        Campeonato ligaFutbol = new Liga("Liga de Fútbol");
        ligaFutbol.agregarInscripcion(inscripcion1);
        ligaFutbol.agregarInscripcion(inscripcion2);

        Campeonato ligaBaloncesto = new Liga("Liga de Baloncesto");
        ligaBaloncesto.agregarInscripcion(inscripcion3);

        ligaFutbol.registrarResultado(inscripcion1, 2, inscripcion2, 2);
        ligaFutbol.mostrarDetalles();

        ligaBaloncesto.registrarResultado(inscripcion3, 5, inscripcion1, 3); // Notas: Inscripción 1 es de fútbol pero para demostrar diferentes campeonatos
        ligaBaloncesto.mostrarDetalles();
    }
}
