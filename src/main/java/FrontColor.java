import bandeau.Bandeau;

import java.awt.*;


public class FrontColor {

    private Color couleur;
    private Bandeau monBandeau;

    public FrontColor(Color couleur, Bandeau monBandeau) {
        this.couleur = couleur;
        this.monBandeau = monBandeau;
    }

    public void changerCouleur() {
        monBandeau.setForeground(couleur);
    }
}

