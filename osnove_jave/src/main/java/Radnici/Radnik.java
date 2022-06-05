package Radnici;

import java.util.ArrayList;

//        Kreirati abstraktnu klasu Radnik koja ima:
//        ime i prezime
//        niz sektora u kojima radi
//        abstraktnu metodu koja vraca platu radnika
//        metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
public abstract class Radnik {
    protected String imePrezime;
    protected ArrayList<Sektor> sektori = new ArrayList<>();
    public abstract double plata();
    public void zaposli(Sektor sekt){
        this.sektori.add(sekt);
    }
}
