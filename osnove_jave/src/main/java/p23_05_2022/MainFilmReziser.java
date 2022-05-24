package p23_05_2022;

public class MainFilmReziser {
    public static void main(String[] args) {

        Film f = new Film("filmic", 1999);
        f.stampaj();
        Reziser r = new Reziser("Gru Gruic", 34);
        r.stampaj();
    }
}
