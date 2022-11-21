import bandeau.Bandeau;

import java.awt.*;


public class FrontColor extends Effet {

    private Color couleur;

    public FrontColor(Bandeau b, int repetition, Color couleur) {
        super(b, repetition);
        this.couleur = couleur;
    }

    public void Jouer() {
        getB().setForeground(couleur);
        getB().sleep(1000);
    }
}

