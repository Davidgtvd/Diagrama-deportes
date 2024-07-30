package com.tu_nombre_de_paquete.deporte;

public class DeporteIndividual extends Deporte {

    public DeporteIndividual(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Deporte individual: " + getNombre());
    }
}
