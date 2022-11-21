import bandeau.Bandeau;
import exemple.ExempleDUtilisation;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Scenario {

    private Bandeau monBandeau;
    private int combien;
    private final HashMap<Effet, Integer> mesEffets = new HashMap();

    public Scenario(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }

    public void AjouterEffet(Effet effet, int nb) {
        combien = nb;
        mesEffets.put(effet, nb);
    }


    public void Jouer() {

        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        for (Map.Entry<Effet, Integer> effet : mesEffets.entrySet()) {
            for (int i = 0; i < effet.getValue(); i++) {
                effet.getKey().Jouer();
            }
        }
        monBandeau.close();

    }


}
