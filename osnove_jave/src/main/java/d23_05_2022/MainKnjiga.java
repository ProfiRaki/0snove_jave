package d23_05_2022;
 //        U glavnom programu napraviti vise autora sa vise knjiga.
public class MainKnjiga {
    public static void main(String[] args) {
        Autor a = new Autor("Po", "Poic");
        Knjiga k = new Knjiga("3452", "Pomlecenje", 1999, a);
        k.stampaj();
        Autor a1 = new Autor("Ru", "Ruic");
        Knjiga k1 = new Knjiga("2152", "Zalecenje", 1988, a1);
        k1.stampaj();
        Autor a2 = new Autor("Tro", "Troic");
        Knjiga k2 = new Knjiga("1112", "Razlecenje", 1977, a2);
        k2.stampaj();
    }
}
