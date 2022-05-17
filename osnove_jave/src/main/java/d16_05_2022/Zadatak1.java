package d16_05_2022;
//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
//        prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

import java.util.Random;

public class Zadatak1 {
    public static void main(String[] args) {
        Random r = new Random();
        int vrednost = r.nextInt(50);
        int brojRazlicitihVrednosti = r.nextInt(6) + 5;
        for (int i = 0; i < brojRazlicitihVrednosti; i++) {
            System.out.print("Vrednost uvecana za 10 je ");
            stampajVrednostZa10Vecu(vrednost);
            System.out.println();
            vrednost = r.nextInt(50);
        }
    }
    static void stampajVrednostZa10Vecu(int n){
        System.out.println(n+10);
    }
}
