package d19_05_2022;
//       3.(ZA VEZBANJE) Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)

public class FaceBookPost {
    String objavioc;
    String objavljenioc;
    String text;
    int lajkovi;
    int deljenja;
    public void like(){
        this.lajkovi++;
    }
    public void dislike(){
        if(this.lajkovi==0)
            this.lajkovi =0;
        else
            this.lajkovi -= 1;
    }
    public void share(){
        this.deljenja++;
    }
    public void stampaj(){
        System.out.println(this.objavioc + " >>> " + this.objavljenioc);
        System.out.println(this.text);
        System.out.println("Likes (" + this.lajkovi + ")  |  Shares (" + deljenja + ")");
    }
}
