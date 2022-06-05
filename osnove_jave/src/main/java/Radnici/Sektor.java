package Radnici;
//       Kreirati klasu Sektor koja ima:
//        naziv sektora
//        platu koja je za taj sektor

public class Sektor {
    private String naziv;
    private int plataZaSektor;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPlataZaSektor() {
        return plataZaSektor;
    }

    public void setPlataZaSektor(int plataZaSektor) {
        this.plataZaSektor = plataZaSektor;
    }
}


