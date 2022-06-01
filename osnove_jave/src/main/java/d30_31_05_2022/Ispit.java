package d30_31_05_2022;
//        Napisati klasu Ispit koja ima
//        naziv predmeta
//        ocenu (u rasponu od 5 do 10)
//        Ime i prezime profesora koji predaje predmet
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za sve atribute
//        metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//        metodu koja stampa ispit u formatu:
//        (naziv predmeta) - (profesor) - (ocena)


public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String imePrezimeProf;
    public Ispit(String nazivPredmeta, int ocena, String imePrezimeProf){
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imePrezimeProf = imePrezimeProf;
    }
    public boolean polozenIspit(){
        if(this.ocena>5)
            return true;
        return false;
    }
    public void stampaj(){
        System.out.println(nazivPredmeta + " - " + imePrezimeProf + " - " + ocena);
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProf() {
        return imePrezimeProf;
    }

    public void setImePrezimeProf(String imePrezimeProf) {
        this.imePrezimeProf = imePrezimeProf;
    }
}
