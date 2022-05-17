package p16_05_2022;
////      Napisati funkciju koja vrsi konverziju eura u dinare,
//        rublje ili dolare prema dole navedenoj konverziji.
//        Metoda od parametara prima vrednost u eurima kao i valutu
//        u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//        U glavnom programu pozvati funkciju za neki od primera.

public class Metod9 {
    public static void main(String[] args) {
        System.out.println(konverzija(5,USD));
    }
    static double konverzija(double eur,String valuta){
        if(valuta.equals("RSD"))
            return eur*117.2113;
        else if(valuta.equals("USD"))
            return eur*1.1821;
        else if(valuta.equals("RUB"))
            return eur*89.234;
        else
            return 0;
    }

}
