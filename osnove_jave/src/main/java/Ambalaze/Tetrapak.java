package Ambalaze;
//       Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//        atribut koji kaze da li se moze reciklirati
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu tako da ispunjava uslova:
//        ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//        ako nije u cenu ulazi samo osnovna cena
//        metoda stampaj stampa sve podatke iz klase tetrapak.

public class Tetrapak extends Ambalaza {
    private boolean mozeReciklirati;
    private int osnovnaCena;

    public boolean isMozeReciklirati() {
        return mozeReciklirati;
    }

    public void setMozeReciklirati(boolean mozeReciklirati) {
        this.mozeReciklirati = mozeReciklirati;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barcod, String nazivArtikla, int netoTezina, int brutoTezina,
                    boolean mozeReciklirati, int osnovnaCena) {
        super(barcod, nazivArtikla, netoTezina, brutoTezina);
        this.mozeReciklirati = mozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla() {
        if (mozeReciklirati == true)
            return   tezinaPakovanja()*1.5 + osnovnaCena;
        else
            return osnovnaCena;
    }
    @Override
    public void stampaj(){
        System.out.println( barcod + ", " + nazivArtikla + ", " + netoTezina + ", " + brutoTezina);
        System.out.print(osnovnaCena + ",");
        if(mozeReciklirati == true)
            System.out.println(" Moze se reciklirati");
        else
            System.out.println(" Ne moze se reciklirati");

    }
}
