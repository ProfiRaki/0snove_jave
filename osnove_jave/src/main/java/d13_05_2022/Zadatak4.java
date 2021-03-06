package d13_05_2022;
//        Napisati program koji uci korisnika da kaze “Molim te”.
//        Program od korisnika ucitava zahteve koje treba da izvrsi
//        ali jedino reaguje ukoliko korisnik lepo zamoli
//        ( u zahtevu unese “Molim te”).
//        Ukoliko korisnik unese zahtev u vidu naredjivanja,
//        program ne reaguje na takve zahteve tj. nista ne ispisuje,
//        a ukoliko korisnik zamoli tada program ispisuje “Dogovoreno!”.
//        Program radi dok korisnik ne unese “Hvala!”. Na kraju programa ispisati “Cao”
//        Commitujte zadatak i push-ujte na github, sa porukom
//        “Domaci 13.05.2022 Zadatak 4”. Za ovaj zadatak trebace vam nextLine metoda sa scannerom.

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String zahtev = "";
        while (!zahtev.equals("Hvala")){
            System.out.println("Unesi zahtev: ");
            zahtev = s.nextLine();
            if(zahtev.startsWith("Molim te"))
                System.out.println("Dogovoreno");
            else if (zahtev.equals("Hvala"))
                System.out.println("Cao");
        }
    }
}
