
package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Vastustaja {
    
    private Scanner scanner;
    Object o;
    
    public Vastustaja(Scanner s) {
        this.scanner = s;
    }
    
    public Vastustaja(Object o) {
        this.o = o;
    }

    public Vastustaja() {
    }
    
    public static Vastustaja luoToinenPelaaja() {
        return new Vastustaja(null);
    }
    
    public static Vastustaja luoTekoalyVastustaja() {
        return new Vastustaja(new KPSTekoaly());
    }
    
    public static Vastustaja luoParempiTekoalyVastustaja() {
        return new Vastustaja(new KPSParempiTekoaly());
    }

}
