package d18_05_2022;
//         Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//        atribut za mod (hladi/greje)
//        metodu za stampu - stampa u formatu: Proizvoljno :)


public class SmartAirConditioning {
    String marka;
    int izabranaTemperatura;
    String mod;
    static void stampaj(String _marka, int temperatura, String _mod){
        System.out.println(_marka + ", " + temperatura + ", " + _mod);

    }
}
