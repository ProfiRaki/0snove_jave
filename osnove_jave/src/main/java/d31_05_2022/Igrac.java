package d31_05_2022;
//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//        difoltni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

public class Igrac extends Osoba{
    private int brojNaDresu;
    private String pozicija;
    private boolean kapiten;
    public Igrac(){

    }
    public Igrac(String imePrezime,String jmbg, int godinaRodjenja,
                 int brojNaDresu, String pozicija,boolean kapiten){
        super(imePrezime,jmbg,godinaRodjenja);
        this.brojNaDresu = brojNaDresu;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println(brojNaDresu +", " + pozicija + ", " + kapiten);
    }

}
