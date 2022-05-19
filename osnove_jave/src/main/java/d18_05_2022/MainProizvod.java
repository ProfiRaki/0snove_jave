package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();
        Proizvod p2 = new Proizvod();
        p1.naziv = "sanpon";
        p1.cena = 145.00;
        p1.tezina = 200.00;
        Proizvod.stampaj(p1.naziv, p1.cena, p1.tezina);
        p2.naziv = "sapun";
        p2.cena = 45;
        p2.tezina = 100;
        Proizvod.stampaj(p2.naziv, p2.cena, p2.tezina);
    }
}
