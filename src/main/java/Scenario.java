import bandeau.Bandeau;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Scenario {

    private int repetition;
    private final HashMap<Effet, Integer> mesEffets = new HashMap();

    public void AjouterEffet(Effet effet, int rep){
        repetition = rep;
        mesEffets.put(effet, rep);

    }

    public int getRepetition() {
        return repetition;
    }

    public void jouer(){
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        for(Map.Entry<Effet, Integer> effet : mesEffets.entrySet()){
            effet.getKey().jouer();
        }

    }


}
