package Ambalaze;
//          Kreirati klasu Korpa koja ima:
//        niz ambalaza
//        metodu dodaj ambalazu
//        metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//        privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//        metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//                  kao parametar funkcije se prima Super karticu iz koje se cita popust.

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (ambalaze.get(i).getBarcod() == barkod) {
                ambalaze.remove(i);
                break;
            }
        }
    }

    private double cenaSPopustom(int popust) {
        int suma = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            suma += ambalaze.get(i).cenaArtikla();
        }
        return suma;
    }
    public double cena(SuperKartica sk){
       return cenaSPopustom(sk.getPopust());
    }
}