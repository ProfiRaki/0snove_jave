package d18_05_2022;
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}

import java.sql.SQLOutput;

public class Proizvod {
    String naziv;
    double cena;
    double tezina;
    static void stampaj(String _naziv, double _cena, double _tezina){
        System.out.print(_naziv + ", " + _cena + ", " + _tezina);
        System.out.println();
    }
}
