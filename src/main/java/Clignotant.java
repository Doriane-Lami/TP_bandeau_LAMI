import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Effet{

    private Bandeau monBandeau;

    public Clignotant(Bandeau bandeau){
        monBandeau = bandeau;
    }

    public void jouer(){
        for (int i = 0; i < getRepetition(); i += 1) {
            monBandeau.setMessage("On clignote");
            monBandeau.sleep(100);
        }
    }

}
