package com.ucb.edu;

public class Persona {
    private int origen;
    private int destino;
    public Persona(int origen, int destino){
        this.origen=origen;
        this.destino=destino;
    }
    public int getOrigen(){
        return origen;
    }
    public int getDestino(){
        return destino;
    }
}
