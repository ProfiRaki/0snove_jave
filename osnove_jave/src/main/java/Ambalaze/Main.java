package Ambalaze;
//       U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko
//        Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

public class Main {
    public static void main(String[] args) {
        Korpa ambalaze = new Korpa();
        Ambalaza t1 = new Tetrapak("123421","CokoladnoMleko",250,325,
                                  true,125);
        Ambalaza t2 = new Tetrapak("234632","jogurt",1000,1180,
                                   false,110);
        Ambalaza st1 = new StaklenaAmbalaza("345743","vino",700,1120,
                                            100,true,120);
        Ambalaza st2 = new StaklenaAmbalaza("135642","coca cola",500,750,
                                            75,true,95);
        ambalaze.dodajAmbalazu(t1);
        ambalaze.dodajAmbalazu(t2);
        ambalaze.dodajAmbalazu(st1);
        ambalaze.dodajAmbalazu(st2);
        SuperKartica superKartica = new SuperKartica("369852","Tr Tric",100);
        System.out.println("Ukupna cena sa popustom je: " + ambalaze.cena(superKartica));


    }
}
