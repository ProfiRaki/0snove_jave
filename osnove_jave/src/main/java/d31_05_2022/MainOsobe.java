package d31_05_2022;
 //       U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
public class MainOsobe {
    public static void main(String[] args) {
        Igrac igrac1 = new Igrac("Prt Petic","1234432",2001,
                8,"napadac",false);
        Igrac igrac2 = new Igrac("tr tric","12434321",
                1998,7,"odbrambeni",false);
        Trener trener1 = new Trener("Po Poic","7654345",1967,
                20,"pravi");
        Trener trener2 = new Trener("Gru Gruic","8765456",1955,
                30,"kondicioni");
        igrac1.stampaj();
        igrac2.stampaj();
        trener1.stampaj();
        trener2.stampaj();
    }
}
