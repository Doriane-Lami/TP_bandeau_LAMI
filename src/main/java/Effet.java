import bandeau.Bandeau;

import java.util.HashMap;

public abstract class Effet {

    private Bandeau b;
    private int repetition;
    public Effet(Bandeau b, int rep) {
        this.b = b;
        repetition = rep;
    }

    public Bandeau getB() {
        return b;
    }

    public int getRepetition() {
        return repetition;
    }

    public abstract void Jouer();
}
