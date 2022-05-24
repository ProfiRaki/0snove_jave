package p23_05_2022;

public class MainKlasa1 {
    public static void main(String[] args) {
        Kartica k = new Kartica(6, "234-321");
        Kupac kupac = new Kupac("Tr Tric",k);
        Proizvod proizvod = new Proizvod("Patike", 1234, kupac);
        proizvod.stampaj();
    }
}
