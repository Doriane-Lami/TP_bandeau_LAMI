import bandeau.Bandeau;

import java.awt.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        HashMap<Effet, Integer> mesEffets = new HashMap();

        Scenario test = new Scenario();

        test.AjouterEffet(Clignotant, 1);


    }


}
