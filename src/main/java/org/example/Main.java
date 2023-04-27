package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mano[] manos = new Mano[]{new Mano(),new Mano()};
        ArrayList<Carta> baraja = new ArrayList<>();
        rellenarBaraja(baraja);
        verBaraja(baraja);
    }
    private static void rellenarBaraja(ArrayList<Carta> baraja){
        if (baraja != null) {
        for (String palo: new String[]{"♠","♥","♦","♣"}) {
            for (String rank: new String[]{"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"}) {
                baraja.add(new Carta(palo,rank));
            }
        }}
    }
    private static void verBaraja(ArrayList<Carta> baraja) {
        int count = 0;
        for (Carta card:baraja) {
            System.out.print(card.toString() + "; ");
            count++;
            if (count == 13) {
                System.out.println();
                count = 0;
            }
        }
    }
}