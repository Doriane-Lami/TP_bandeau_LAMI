import bandeau.Bandeau;

import java.awt.*;
import java.util.HashMap;

public class Clignotant extends Effet {

    public Clignotant(Bandeau b, int repetition) {
        super(b, repetition);
    }


    public void Jouer() {
        for (int i = 0; i < getRepetition(); i += 1) {
            getB().setMessage("On clignote");
            getB().sleep(100);
            getB().setMessage(" ");
            getB().sleep(100);
        }
        getB().sleep(1000);
    }

}
