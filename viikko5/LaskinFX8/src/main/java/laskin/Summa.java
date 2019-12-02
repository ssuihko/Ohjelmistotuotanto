package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import laskin.Komento;
import laskin.Sovelluslogiikka;

public class Summa extends Komento {

    static int arvoS;
    static int EdelTulosS;

    public Summa(TextField tulos, TextField syote, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tulos, syote, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        
        EdelTulosS = Integer.parseInt(tuloskentta.getText());
        arvoS = Integer.parseInt(syotekentta.getText());
        sovellus.plus(arvoS);

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
        tuloskentta.setText("" + EdelTulosS);
        syotekentta.setText("" + arvoS);
    }
}
