package d24_05_2022;
//        Kreirati klasu Racun koja ima:
//        broj racuna (npr: 170-289328923-23)
//        ime i prezime osobe
//        trenutno stanje na racunu (npr: 100, 1220)
//        gettere i setter za sve atribute, sem settera za stanje na racunu
//        metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//        metodu koja stampa podatke o racunu u formatu:
//        Ime i prezime  -  broj racuna
//        stanje na racunu je (trenutno stanje) rsd.


public class Racun {
    private String broj;
    private String imePrezime;
    private int trenutnoStanje;
    public Racun(String broj, String imePrezime, int trenutnoStanje){
        this.broj = broj;
        this.imePrezime = imePrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }
    public void menjaStane(double suma){
        if(suma<0)
            if(this.trenutnoStanje+suma<0){
                System.out.println("Na racunu nema dovolno novca, bice prebaceno samo " + trenutnoStanje);
                suma = trenutnoStanje;
                this.trenutnoStanje = 0;
            }else
                this.trenutnoStanje += suma;
        else
            this.trenutnoStanje += suma;
    }
    public void stampaj(){
        System.out.println(imePrezime + " - " + broj);
        System.out.println("Stanje na racunu je " + trenutnoStanje + " rsd");
    }

}
