package d30_31_05_2022;
//         Napisati klasu Student koja ima
//        broj indeksa
//        ime i prezime
//        tip studija (osnovne, master, doktorske)
//        niz ispita
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za indeks, ime i prezime, tip studija
//        getter za niz predmeta
//        metodu dodaj ispit u niz ispita
//        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//        metodu stampaj koja stampa u formatu:
//        (broj indeksa) - (ime i prezime) - (tip studija)
//        Predmeti:
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        Prosecna ocena: (prosecna ocena)


import java.util.ArrayList;

public class Student {
    ArrayList<Ispit> niz = new ArrayList<Ispit>();
    private int brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    public void dodajIspit(Ispit ispit){
        this.niz.add(ispit);
    }
    public Student(int brojIndeksa, String imePrezime, String tipStudija){
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
    }
    public double prosek(){
        int suma = 0;
        int brojac = 0;
        for (int i = 0; i < niz.size(); i++) {
            if(niz.get(i).polozenIspit()){
                suma += niz.get(i).getOcena();
                brojac++;
            }
        }
        return suma/brojac*1.0;
    }
    public void stampaj(){
        System.out.println(brojIndeksa + " - " + imePrezime + " - " + tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < niz.size(); i++) {
            System.out.println(niz.get(i).getNazivPredmeta() + " - " +
                               niz.get(i).getImePrezimeProf() + " - " +
                               niz.get(i).getOcena());
        }
        System.out.println("Prosecna ocena: " + prosek());
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNiz() {
        return niz;
    }
}

