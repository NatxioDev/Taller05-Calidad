package com.ucb.edu;

public class Ascensor {

    private int ubicacion = 0;
    public String error = "";

    public String movimiento(Persona persona) {

        if (persona.getOrigen() < 0 || persona.getDestino() < 0) {
            error = "No se puede ingresar pisos negativos";
            return error;
        }

        if (persona.getOrigen() == persona.getDestino()) {
            error = "No se puede ingresar pisos iguales";
            return error;

        }

        if (persona.getOrigen() > 3 || persona.getDestino() > 3) {
            error = "No se puede ingresar pisos mayores a 3";
            return error;
        }

        if (persona.getOrigen() == 0 && persona.getDestino() == 0) {
            error = "No se puede ingresar pisos iguales a 0";
            return error;
        }

        if (persona.getOrigen() != ubicacion) {
            if (persona.getOrigen() > ubicacion) {
                while (persona.getOrigen() > ubicacion) {
                    ubicacion++;
                }
            } else {
                while (persona.getOrigen() < ubicacion) {
                    ubicacion--;
                }
            }
        }

        if (persona.getOrigen() > persona.getDestino()) {
            ubicacion = persona.getOrigen() - persona.getDestino();
            return "El ascensor se movio hacia abajo " + ubicacion + " pisos";
        }

        if (persona.getOrigen() < persona.getDestino()) {
            ubicacion = persona.getDestino() - persona.getOrigen();
            return "El ascensor se movio hacia arriba " + ubicacion + " pisos";
        }

        return "El ascensor no se movio";
    }

    public Persona crearPersona() {
        int destino = (int) (Math.random() * 3 + 1);
        int origen = (int) (Math.random() * 3 + 1);
        while (destino == origen) {
            destino = (int) (Math.random() * 3 + 1);
            origen = (int) (Math.random() * 3 + 1);
        }
        System.out.println("La persona esta en el piso " + origen + " y quiere ir al piso " + destino);
        return new Persona(origen, destino);
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }


}
