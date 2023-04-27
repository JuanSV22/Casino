package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Mano[] manos = new Mano[]{new Mano(),new Mano()};
        ArrayList<Carta> baraja = new ArrayList<>();
        rellenarBaraja(baraja);
        System.out.println("Baraja:\n"+verBaraja(baraja));
        System.out.println("- – — ―\uD835\uDDE2\uD835\uDDE3\uD835\uDDD8\uD835\uDDE1 \uD835\uDDE7\uD835\uDDDB\uD835\uDDD8 \uD835\uDDDA\uD835\uDDD4\uD835\uDDE0\uD835\uDDD8― — – -");
        iniciarJuego(manos, baraja);
        System.out.println("Mano 1: "+verMano(manos[0]));
        System.out.println("Mano 2: "+verMano(manos[1]));
        System.out.println("Baraja:\n"+verBaraja(baraja));
    }
    private static void rellenarBaraja(ArrayList<Carta> baraja){
        if (baraja != null) {
        for (String palo: new String[]{"♠","♥","♦","♣"}) {
            for (String rank: new String[]{"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"}) {
                baraja.add(new Carta(palo,rank));
            }
        }}
    }
    private static String verBaraja(@NotNull ArrayList<Carta> baraja) {
        int count = 0;
        String string = "";
        for (Carta card:baraja) {
            string = string.concat(card.toString() + "; ");
            count++;
            if (count == 13) {
                string += "\n";
                count = 0;
            }
        }
        return string;
    }
    private static String verMano(@NotNull Mano mano){
        return verBaraja(mano.getCartas());
    }
    private static void sacarCarta(@NotNull Mano manoADar, @NotNull ArrayList<Carta> baraja) {
        Random randomGenerator = new Random();
        Carta cardToTake = baraja.get(randomGenerator.nextInt(baraja.size()));
        baraja.remove(cardToTake);
        manoADar.addCarta(cardToTake);
    }

    private static void iniciarJuego(@NotNull Mano[] manos, @NotNull ArrayList<Carta> baraja) {
        for (Mano mano:manos){
            sacarCarta(mano,baraja);
            sacarCarta(mano,baraja);
        }
    }
}