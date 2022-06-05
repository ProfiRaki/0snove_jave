package Radnici;
//      U glavnom programu kreirati jednog magacionera i jednog menadzera,
//        postaviti sektore u kojima rade i ispisati platu za svakog

public class Main {
    public static void main(String[] args) {
        Sektor sektor1 = new Sektor();
        Sektor sektor2 = new Sektor();
        Sektor sektor3 = new Sektor();
        Menadzer menadzer = new Menadzer();
        Magacioner magacioner = new Magacioner();
        sektor1.setNaziv("Prodaja");
        sektor1.setPlataZaSektor(650);
        sektor2.setNaziv("Nabavka");
        sektor2.setPlataZaSektor(540);
        menadzer.imePrezime = "Tr Tric";
        menadzer.sektori.add(sektor1);
        menadzer.sektori.add(sektor2);
        sektor3.setNaziv("Magacin");
        sektor3.setPlataZaSektor(475);
        magacioner.imePrezime = "Gru Gruic";
        magacioner.sektori.add(sektor3);
        System.out.println("Plata magacionera je: " + magacioner.plata());
        System.out.println("Plata menadzera je: " +menadzer.plata());
    }
}
