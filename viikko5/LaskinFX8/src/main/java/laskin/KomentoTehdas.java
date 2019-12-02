
public class Summa extends Komento {
    public Summa(IO io) {
        super(io);
    }

    @Override
    public void suorita() {
        io.print("luku 1: ");
        int luku1 = io.nextInt();

         io.print("luku 2: ");
        int luku2 = io.nextInt();
        
        io.print("vastaus: "+luku1 + luku2);
    }  
}

public class Miinus extends Komento {
    public Miinus(IO io) {
        super(io);
    }

    @Override
    public void suorita() {
        io.print("luku 1: ");
        int luku1 = io.nextInt();

         io.print("luku 2: ");
        int luku2 = io.nextInt();
        
        io.print("vastaus: "+luku1 - luku2);
    }
}  

    public class Nollaa extends Komento {
    public Nollaa(IO io) {
        super(io);
    }

    @Override
    public void suorita() {
        io.print("luku 1: ");
        int luku1 = io.nextInt();

         io.print("luku 2: ");
        int luku2 = io.nextInt();
        
        io.print("vastaus: "+luku1 + luku2);
    }  
}
}
