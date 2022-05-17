package d16_05_2022;
//
//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

public class Zadatak3 {
    public static void main(String[] args) {
       person("34567890", "Dragan", "Radosevic",1975,true);
    }
    static void person(String jbgm,String ime,String prezime,int godRodjenja, boolean aktivan) {
        System.out.println("JBMG: " + jbgm);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}
