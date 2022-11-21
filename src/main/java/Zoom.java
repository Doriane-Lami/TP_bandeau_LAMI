import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{

    private Bandeau monBandeau;

    public Zoom(Bandeau bandeau) {
        monBandeau = bandeau;
    }

    public void jouer() {
        for (int i = 5; i < 60; i += 1) {
            monBandeau.setFont(new Font("Zoom", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
    }
}
