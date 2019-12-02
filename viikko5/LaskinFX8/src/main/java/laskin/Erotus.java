package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import laskin.Komento;
import laskin.Sovelluslogiikka;

public class Erotus extends Komento {

    static int arvoE;
    static int EdelTulosE;

    public Erotus(TextField tulos, TextField syote, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tulos, syote, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        
        EdelTulosE = Integer.parseInt(tuloskentta.getText());
        arvoE = Integer.parseInt(syotekentta.getText());
        sovellus.miinus(arvoE);
        int laskunTulos = sovellus.tulos();

        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);

        if (laskunTulos == 0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
        undo.disableProperty().set(false);

    }

    @Override
    public void peru() {
        tuloskentta.setText("" + EdelTulosE);
        syotekentta.setText("" + arvoE);
    }
}
