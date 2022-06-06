package Ambalaze;
//        Kreirati klasu SuperKartica koja ima:
//        broj kartice
//        ime i prezime vlasnika
//        popust (200, 500, … )
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu stampaj koja stampa karticu u formatu:
//        (broj kartice), (ime i prezime)


public class SuperKartica {
    private String brojKartice;
    private String pinoImeVlasnika;
    private int popust;

    public SuperKartica(String brojKartice, String pinoImeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.pinoImeVlasnika = pinoImeVlasnika;
        this.popust = popust;
    }

    public SuperKartica() {
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPinoImeVlasnika() {
        return pinoImeVlasnika;
    }

    public void setPinoImeVlasnika(String pinoImeVlasnika) {
        this.pinoImeVlasnika = pinoImeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampaj(){
        System.out.println("(" + brojKartice + "), (" + pinoImeVlasnika + ")");
    }
}
