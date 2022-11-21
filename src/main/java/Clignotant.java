import bandeau.Bandeau;

import java.awt.*;
import java.util.HashMap;

public class Clignotant extends Effet {

    public void Jouer() {
        for (int i = 0; i < getRepetition(); i += 1) {
            getMonBandeau().setMessage("On clignote");
            getMonBandeau().sleep(100);
        }
    }

}
