import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet {

    public void Jouer() {
        for (int i = 5; i < 60; i += 1) {
            getMonBandeau().setFont(new Font("Zoom", Font.BOLD, 5 + i));
            getMonBandeau().sleep(100);
        }
    }
}
