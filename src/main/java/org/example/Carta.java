package org.example;

public class Carta {
    private final String palo;
    private final String rank;

    public Carta(String palo, String rank) {
        this.palo = palo;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + palo;
    }
}
