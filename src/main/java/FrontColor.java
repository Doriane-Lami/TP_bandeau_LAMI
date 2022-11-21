import bandeau.Bandeau;

import java.awt.*;


public class FrontColor extends Effet {

    private Color couleur;


    public FrontColor(Color couleur) {
        this.couleur = couleur;
    }

    public void Jouer() {
        getMonBandeau().setForeground(couleur);
    }
}

