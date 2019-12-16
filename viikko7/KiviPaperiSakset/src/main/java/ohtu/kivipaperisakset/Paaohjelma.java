package ohtu.kivipaperisakset;

import java.util.Scanner;
import static ohtu.kivipaperisakset.Vastustaja.luoParempiTekoalyVastustaja;
import static ohtu.kivipaperisakset.Vastustaja.luoTekoalyVastustaja;
import static ohtu.kivipaperisakset.Vastustaja.luoToinenPelaaja;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                KPSPelaajaVsPelaaja kaksinpeli = new KPSPelaajaVsPelaaja();
                Vastustaja v = luoToinenPelaaja();
                kaksinpeli.pelaa();
            } else if (vastaus.endsWith("b")) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                KPSTekoaly yksinpeli = new KPSTekoaly();
                Vastustaja v = luoTekoalyVastustaja();
                yksinpeli.pelaa();
            } else if (vastaus.endsWith("c")) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                KPSParempiTekoaly pahaYksinpeli = new KPSParempiTekoaly();
                Vastustaja v = luoParempiTekoalyVastustaja();
                pahaYksinpeli.pelaa();
            } else {
                break;
            }

        }

    }
}
