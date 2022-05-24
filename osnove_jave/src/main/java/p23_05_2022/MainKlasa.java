package p23_05_2022;

public class MainKlasa {
    public static void main(String[] args) {
        Korisnik k = new Korisnik("Tr","Tric");
        FaceBookPost f = new FaceBookPost("jjjjjjjj lll",k);
        f.stampaj();
        FaceBookPost f1 = new FaceBookPost("bbbbbbbb",k);
        f1.stampaj();
    }
}
