package p23_05_2022;
//        ime i prezime
//        clansku kartu
//        gettere i settere, clanska karta ne moze da se menja
//        konstruktore
//        metodu stampaj koja stampa u formatu
//        ime i prezime - broj kartice

public class Kupac {
    private String punoIme;
    private Kartica clanskaKarta;

    public Kartica getClanskaKarta() {
        return clanskaKarta;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
    public Kupac(String punoIme,Kartica clanskaKarta){
        this.punoIme = punoIme;
        this.clanskaKarta = clanskaKarta;
    }
    public void stampaj(){
        System.out.print(punoIme +" - " + clanskaKarta.getBrojKartice());

    }
}
