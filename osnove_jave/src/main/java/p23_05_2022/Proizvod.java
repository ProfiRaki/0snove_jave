package p23_05_2022;
//        Naziv proizvoda
//        kupca/musteriju
//        cenu izrade proizvoda
//        gettere i settere
//        konstruktore
//        Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//        cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//        Metodu za stampanje proizvoda u formatu:
//        naziv proizvoda - cena
//        ime i prezime - broj kartice

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private int cenaIzrade;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
    public Proizvod(String naziv, int cenaIzrade, Kupac kupac){
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
        this.kupac = kupac;

    }
    public double cena(){
        return this.cenaIzrade * 1.9 * (100 - kupac.getClanskaKarta().getPopust())/100;
    }public void stampaj(){
        System.out.println(naziv + " - " + cena());
        kupac.stampaj();
    }
}
