package d13_05_2022;
//         Napisati program koji ima niz brojeva duzine 10.
//        Niz je fiksnih vrednosti (ne u nosi ih korisnik)
//        a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza.
//        Pre i nakon izbacivanja ispisati niz na ekranu.
//        Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//        Commitujte zadatak i pushujte na github sa porukom
//        Domaci 13.05.2022 Zadatak 3 brisanje iz niza“



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            niz.add(r.nextInt(10));
        }
        System.out.println("Unesi poziciju elementa za izbacivanje: ");
        int pozicijaZaIzbacivanje = s.nextInt(10);
        System.out.println(niz);
        niz.remove(pozicijaZaIzbacivanje);
        System.out.println(niz);
    }
}
