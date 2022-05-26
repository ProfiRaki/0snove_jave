package d24_05_2022;

public class MainRacunTransakcija {
    public static void main(String[] args) {
        Racun uplatioc = new Racun("170-289328923-23", "Yr Tric", 11000);
        Racun primaoc = new Racun("160-289328923-23", "Grr Gruic", 22000);
        Transakcija t = new Transakcija(234531, uplatioc, primaoc);
        t.izvrsiTransakciju(12000, uplatioc, primaoc);
        t.stampaj();
    }
}
