package ohtu.kivipaperisakset;

public abstract class pelaa extends Komento {

    public pelaa(IO io) {
        super(io);
    }
    

    @Override
    public void suorita() {
        Tuomari tuomari = new Tuomari();
        Tekoaly tekoaly = new Tekoaly();
        
        io.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = io.nextString();
        
        String tokanSiirto;

        tokanSiirto = tekoaly.annaSiirto();
        io.print("Tietokone valitsi: " + tokanSiirto);


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            io.print(tuomari.toString());
            io.print("");

            io.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = io.nextString();

            tokanSiirto = tekoaly.annaSiirto();
            io.print("Tietokone valitsi: " + tokanSiirto);
            tekoaly.asetaSiirto(ekanSiirto);

        }

        io.print("");
        io.print("Kiitos!");
        io.print(tuomari.toString());
        
        

    }
    
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

}