package org.example;

import java.util.List;

public class Mano {
    private List<Carta> cartas;

    public Mano(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Mano() {
    }

    public void addCarta(Carta nuevaCarta) {

    }

    public List<Carta> getCartas() {
        return cartas;
    }

    @Override
    public String toString() {
        return cartas.toString();
    }
}
