import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet {

    public Zoom(Bandeau b, int repetition) {
        super(b, repetition);
    }

    public void Jouer() {
        for (int i = 5; i < 60; i += 1) {
            getB().setFont(new Font("Zoom", Font.BOLD, 5 + i));
            getB().sleep(100);
        }
        getB().sleep(1000);
    }
}
