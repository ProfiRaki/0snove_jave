package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();
        Proizvod p2 = new Proizvod();
        p1.naziv = "Sapun";
        p1.cena = 45;
        p1.tezina = 100;
        p1.stampaj();
        p1.povecajCenu(10);
        p1.stampaj();
        System.out.println("Cena sa popustom je: " + p1.vratiCenuSaPopustom(5));
        System.out.println("Postarina je: " + p1.racunajPostarinu());
        p2.naziv = "Sampon";
        p2.cena = 210;
        p2.tezina = 250;
        p2.stampaj();
        p2.povecajCenu(10);
        p2.stampaj();
        System.out.println("Cena sa popustom je: " + p2.vratiCenuSaPopustom(15));
        System.out.println("Postarina je: " + p2.racunajPostarinu());
    }
}
