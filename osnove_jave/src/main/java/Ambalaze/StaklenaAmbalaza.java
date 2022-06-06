package Ambalaze;
//        Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//        kaucija za flasu
//        atribut koji kaze da li se za flasu placa kaucija
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu
//        ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//        ako se ne placa, (osnovna cena) * 1.2
//        metoda stampaj stampa sve podatke iz klase staklena flasa.

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean placaSeKaucija;
    private int osnovnaCena;

    public StaklenaAmbalaza(String barcod, String nazivArtikla, int netoTezina, int brutoTezina,
                            int kaucija, boolean placaSeKaucija, int osnovnaCena) {
        super(barcod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla(){
        if(placaSeKaucija == true)
            return osnovnaCena*1.2 + kaucija;
        return osnovnaCena*1.2;
    }
    @Override
    public void stampaj(){
        System.out.println( barcod + ", " + nazivArtikla + ", " + netoTezina + ", " + brutoTezina);
        System.out.print(osnovnaCena + ",");
        if(placaSeKaucija==true)
            System.out.println(" Placa se kaucija");
        else
            System.out.println( " ne placa se kaucija");
    }
}
