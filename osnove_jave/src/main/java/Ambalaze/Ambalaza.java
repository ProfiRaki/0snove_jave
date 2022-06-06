package Ambalaze;
//        Kreirati abstraktnu klasu Ambalaza koja ima:
//        barkod (primer: 328232-2823)
//        naziv artikla
//        neto tezinu
//        bruto tezinu
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//        abstraktnu metodu koja vraca cenu artikla
//        abstraktnu metodu stampaj

public abstract class Ambalaza {
    protected String barcod;
    protected String nazivArtikla;
    protected int netoTezina;
    protected int brutoTezina;

    public Ambalaza(String barcod, String nazivArtikla, int netoTezina, int brutoTezina) {
        this.barcod = barcod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }
    public Ambalaza(){

    }

    public String getBarcod() {
        return barcod;
    }

    public void setBarcod(String barcod) {
        this.barcod = barcod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }
    public int tezinaPakovanja(){
        return brutoTezina - netoTezina;
    }
    public abstract double cenaArtikla();
    public abstract void stampaj();
}
