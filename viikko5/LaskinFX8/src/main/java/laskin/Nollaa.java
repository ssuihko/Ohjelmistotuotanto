package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import laskin.Komento;
import laskin.Sovelluslogiikka;

public class Nollaa extends Komento {
    
    static int arvo;

    public Nollaa(TextField tulos, TextField syote, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tulos, syote, nollaa, undo, sovellus);
    }
    
    @Override
    public void suorita() {
        arvo = Integer.parseInt(syotekentta.getText());
        sovellus.nollaa();
        int laskunTulos = sovellus.tulos();
        
        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
       
        
     
    }  

    @Override
    public void peru() {
        syotekentta.setText("" + arvo);
    }
}