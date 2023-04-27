package org.example;

import java.util.ArrayList;

public class Mano {
    private ArrayList<Carta> cartas;
    /*
    -public Mano(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }*/

    public Mano() {
    }

    public void addCarta(Carta nuevaCarta) {

    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    @Override
    public String toString() {
        return cartas.toString();
    }
}
