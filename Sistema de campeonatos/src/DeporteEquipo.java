package com.tu_nombre_de_paquete.deporte;

public class DeporteEquipo extends Deporte {
    private int numeroJugadores;

    public DeporteEquipo(String nombre, int numeroJugadores) {
        super(nombre);
        this.numeroJugadores = numeroJugadores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Deporte de equipo: " + getNombre() + " con " + numeroJugadores + " jugadores.");
    }
}
