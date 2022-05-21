package PrviJavaTest;
//       Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//        Lozinka je validna ukoliko ima minimum 8 karaktera
//        i sadrzi bar jedan od dva specijalna karaktera a specijalni karakteri su @ i #

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean p = true;
        while (p) {
            System.out.print("Unesi lozinku: ");
            String lozinka = s.next();
            int brojac = 0;
            int i = 0;
            while (lozinka.length() >= 8 && i < lozinka.length()) {
                if (lozinka.charAt(i) == '@' || lozinka.charAt(i) == '#') {
                    System.out.println("Lozinka je validna");
                    p = false;
                }
                    i++;
                }
                if (p)
                    System.out.println("Lozinka nije validna");
            }
        }
    }
