package org.example;

import java.util.ArrayList;

public class Mano {
    private final ArrayList<Carta> cartas;
    /*
    -public Mano(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }*/

    public Mano() {
        cartas = new ArrayList<>();
    }

    public void addCarta(Carta nuevaCarta) {
        cartas.add(nuevaCarta);
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}
