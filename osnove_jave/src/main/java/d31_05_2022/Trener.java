package d31_05_2022;
//       Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

public class Trener extends Osoba{
    private int godineIskustva;
    private String vrstaTrenera;
    public Trener(){

    }

    public Trener(String imePrezime, String jmbg, int godinaRodjenja,
                  int godineIskustva,String vrstaTrenera){
        super(imePrezime,jmbg,godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.vrstaTrenera = vrstaTrenera;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println(godineIskustva + ", " + vrstaTrenera);
    }

}
