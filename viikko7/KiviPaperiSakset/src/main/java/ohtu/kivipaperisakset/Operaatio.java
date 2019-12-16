
package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class Operaatio {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static Object haeTyyppi(String operaatio) {
        if (operaatio.equals("a")) {
            return scanner;
        } else if (operaatio.equals("b")) {
            return new Tekoaly();
        }
        return new TekoalyParannettu(20);
    }
    
}
