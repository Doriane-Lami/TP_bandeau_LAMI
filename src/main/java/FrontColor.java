import bandeau.Bandeau;

import java.awt.*;


public class FrontColor extends Effet {

    private Color couleur;

    public FrontColor(Bandeau b, Color c, int repetition) {
        super(b, repetition);
        this.couleur = c;
    }

    public void Jouer() {
        getB().setForeground(couleur);
        getB().sleep(1000);
    }
}

