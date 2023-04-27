package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mano[] manos = new Mano[]{new Mano(),new Mano()};
        ArrayList<Carta> baraja = new ArrayList<>();
        rellenarBaraja(baraja);
    }
    private static void rellenarBaraja(ArrayList<Carta> baraja){
        for (String palo: new String[]{"♠","♥","♦","♣"}) {
            for (String rank: new String[]{"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"}) {
                baraja.add(new Carta(palo,rank));
            }
        }
    }
}