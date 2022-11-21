import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Effet{

    public int repetition;
    public Bandeau monBandeau;

    public Clignotant(int rep, Bandeau bandeau){
        repetition = rep;
        monBandeau = bandeau;

    }

    public void UtilisationCligotant(){
        for (int i = 0; i < repetition; i += 1) {
            monBandeau.setMessage("On clignote");
            monBandeau.sleep(100);
        }
    }

}
