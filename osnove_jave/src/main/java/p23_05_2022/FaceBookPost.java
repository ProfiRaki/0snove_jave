package p23_05_2022;
//        Kreirati klasu FacebookPost
//        opis
//        korisnik (referenca na korisnika koji je kreirao post)
//        konstrukore koje mislite da su vam potrebni
//        metoda print, stampa u formatu:
//        (ime) (prezime)
//        (opis post-a)

public class FaceBookPost {
    private String opis;
    private Korisnik korisnik;
    public FaceBookPost(String opis, Korisnik korisnik){
        this.opis = opis;
        this.korisnik = korisnik;
    }
    public void stampaj(){
        System.out.println(opis);
        System.out.print("Post je objavio: ");
        korisnik.stampaj();

    }
}
