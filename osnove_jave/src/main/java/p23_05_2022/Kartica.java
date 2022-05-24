package p23_05_2022;
//        popust (u rasponu od 5 do 10 %)
//        broj kartice (npr: 9329-0239)
//        gettere i setter
//        konstuktore

import java.lang.ref.SoftReference;

public class Kartica {
    private int popust;
    private String brojKartice;

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public Kartica(int popust, String brojKartice){
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
}
