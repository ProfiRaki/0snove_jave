package d24_05_2022;
//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//        konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime


public class ZeleniKarton {
    private String imePrezimeStud;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imePrezimeProf;
    private int ocena;
    public ZeleniKarton(String imePrezimeStud, String brojIndeksa, String nazivPredmeta,
                        String imePrezimeProf, int ocena){
        this.imePrezimeStud = imePrezimeStud;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProf = imePrezimeProf;
        this.ocena = ocena;
    }

    public String getImePrezimeStud() {
        return imePrezimeStud;
    }

    public void setImePrezimeStud(String imePrezimeStud) {
        this.imePrezimeStud = imePrezimeStud;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImePrezimeProf() {
        return imePrezimeProf;
    }

    public void setImePrezimeProf(String imePrezimeProf) {
        this.imePrezimeProf = imePrezimeProf;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean polozenIspit(){
        return this.ocena>5?true:false;
    }
    public void stampaj(){
        System.out.println(nazivPredmeta + " - " + ocena);
        System.out.println("Student: " + imePrezimeStud + ", " + brojIndeksa);
        System.out.println("Profesor: " + imePrezimeProf);
    }
}
