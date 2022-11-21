import bandeau.Bandeau;

import java.awt.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Bandeau monBandeau = new Bandeau();
        Scenario test = new Scenario(monBandeau);
        Clignotant cligno = new Clignotant(monBandeau, 5);
        Zoom zoom1 = new Zoom(monBandeau, 1);
        FrontColor front1 = new FrontColor(monBandeau,Color.RED,1);


        test.AjouterEffet(zoom1, 1);
        test.AjouterEffet(front1,1);
        test.AjouterEffet(cligno, 1);

        test.Jouer();


    }


}
