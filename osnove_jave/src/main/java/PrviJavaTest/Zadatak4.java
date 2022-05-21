package PrviJavaTest;
//        Napisati metodu koja vrsi konverziju metara u cm, dm, km.
//        Metoda kao parametre prima vrednost u metrima
//        i jedinicu u kojoj treba izvrsiti konverziju i vraca konvertovanu vrednost.

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi metre: ");
        double metri = s.nextDouble();
        for (int i = 0; i < 3; i++) {
            System.out.print("Unesi jedinicu: ");
            String jedinica = s.next();
            System.out.println(konvertor(metri,jedinica));
        }
    }
    static double konvertor(double metara, String mernaJedinica) {
        if (mernaJedinica.equals("cm"))
            return metara * 100;
        else if (mernaJedinica.equals("dm"))
            return metara * 10;
        else if (mernaJedinica.equals("km"))
            return metara * 0.001;
        else
            return 0;
    }
}
