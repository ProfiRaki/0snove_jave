package PrviJavaTest;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//        Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
//        Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5,
//        niz je sa fiksnim vrednostima tj. ne unosi ih korisnik.
//        Program stampa tabelu na ekranu a zatim od korisnika trazi
//        da unese kolonu po kojoj bi zeleo da sumira vrednosti
//        i na kraju programa ispisuje sumu za trazenu kolonu.
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Integer> niz = new ArrayList<Integer>();
        System.out.print("Izaberi kolonu za sumiranje: ");
        int kolona = s.nextInt(5);
        int suma = 0;
        for (int i = 0; i < 25; i++) {
            int broj = r.nextInt(10);
            niz.add(broj);
            System.out.print(" " + niz.get(i) + " ");
            if(i%5==4)
                System.out.println();
            if(i%5==kolona)
                suma += niz.get(i);
        }
        System.out.println("Suma u " + kolona + " koloni je " + suma);
    }
}
