package Vezbe;

import java.util.ArrayList;
import java.util.Random;

public class UcitavanjeNiza {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 25; i++) {
            niz.add(r.nextInt(50));
        }
        System.out.println(niz);
    }
}
