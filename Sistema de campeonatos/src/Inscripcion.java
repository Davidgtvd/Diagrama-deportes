package com.tu_nombre_de_paquete.inscripcion;

public class Inscripcion {
    private Participante participante;

    public Inscripcion(Participante participante) {
        this.participante = participante;
    }

    public Participante getParticipante() {
        return participante;
    }

    @Override
    public String toString() {
        return participante.toString();
    }
}
