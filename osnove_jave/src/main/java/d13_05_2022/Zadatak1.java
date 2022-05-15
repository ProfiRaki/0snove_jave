package d13_05_2022;
//         Napisati program koji ima niz brojeva od 25 elemenata,
//        koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti
//        (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//        Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad,
//        ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje,
//        vodite racuna da ne izadjete van opsega niza)
//        Za racunanje sume, nije potrebna petlja!

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 25; i++) {
            niz.add(r.nextInt(10));
        }
        for (int i = 0; i < 25; i++) {
            System.out.print(" " + niz.get(i) + " " + "|");
            if(i%5==4)
                System.out.println();
        }
        System.out.println("Unesi poziciju za sumu: ");
        int pozicijaSume = s.nextInt();
        int suma = 0;
        if(pozicijaSume%5!=0 && pozicijaSume%5!=4 && pozicijaSume>4 && pozicijaSume<20)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume-1)+niz.get(pozicijaSume+1)+
                    niz.get(pozicijaSume-5)+niz.get(pozicijaSume+5);
        if(pozicijaSume%5==0 && pozicijaSume>0 && pozicijaSume<20)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume+1)+
                    niz.get(pozicijaSume-5)+niz.get(pozicijaSume+5);
        if(pozicijaSume%5==4 && pozicijaSume>4 && pozicijaSume<24)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume-1)+
                    niz.get(pozicijaSume-5)+niz.get(pozicijaSume+5);
        if(0<pozicijaSume && pozicijaSume<4)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume-1)+
                    niz.get(pozicijaSume+1)+niz.get(pozicijaSume+5);
        if(20<pozicijaSume && pozicijaSume<24)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume-1)+
                    niz.get(pozicijaSume+1)+niz.get(pozicijaSume-5);
        if(pozicijaSume==0)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume+1)+niz.get(pozicijaSume+5);
        if(pozicijaSume==4)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume-1)+niz.get(pozicijaSume+5);
        if(pozicijaSume==20)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume+1)+niz.get(pozicijaSume-5);
        if(pozicijaSume==24)
            suma = niz.get(pozicijaSume)+niz.get(pozicijaSume-1)+niz.get(pozicijaSume-5);
        System.out.println("Suma na poziciji " + pozicijaSume + " je "+suma);


    }
}
