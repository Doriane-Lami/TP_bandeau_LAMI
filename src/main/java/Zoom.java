import bandeau.Bandeau;

import java.awt.*;

public class Zoom {

    public int tailleFin;
    public int tailleDebut;
    public Bandeau monBandeau;

    public Zoom(int tDebut, int tFin, Bandeau bandeau){
        tailleFin = tFin;
        tailleDebut = tDebut;
        monBandeau = bandeau;

    }

    public void Zoomer(){
        for (int i = tailleDebut; i < tailleFin; i += 1) {
            monBandeau.setFont(new Font("Zoom", Font.BOLD, tailleDebut + i));
            monBandeau.sleep(100);
        }
    }
}
