import bandeau.Bandeau;
import exemple.ExempleDUtilisation;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Scenario {

    private Bandeau monBandeau;
    private int repetition;
    private final HashMap<Effet, Integer> mesEffets = new HashMap();

    public Scenario() {}

    public void AjouterEffet(Effet effet, int rep) {
        repetition = rep;
        mesEffets.put(effet, rep);
    }

    public Bandeau getMonBandeau() {
        return monBandeau;
    }

    public int getRepetition() {
        return repetition;
    }

    public void Jouer() {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        for (Map.Entry<Effet, Integer> effet : mesEffets.entrySet()) {
            effet.getKey().Jouer();
        }

    }


}
