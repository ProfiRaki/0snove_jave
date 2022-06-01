package d30_31_05_2022;

import java.util.Scanner;

public class MainStudentIspit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj indeksa, ime i prezime i tip studija: ");
        Student student1 = new Student( s.nextInt(),s.next(),s.next());
        System.out.println("Unesi broj ispita: ");
        int brojIspita = s.nextInt();
        for (int i = 0; i < brojIspita; i++) {
            System.out.println("Unesi naziv predmeta, ocenu i profesora: ");
            Ispit ispit = new Ispit(s.next(), s.nextInt(), s.next());
            student1.niz.add(ispit);

        }
        student1.stampaj();
    }
}
