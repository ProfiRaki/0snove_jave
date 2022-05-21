package Vezbe;
//         Za potrebe loto igre na srecu,
//        potrebno je napisati program koja ispisuje informaciju da li
//        je odigrana loto kombinacija upravo dobitna kombinacija.
//        Korisnik unosi dva niza oba duzine
//        7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
//        Program na kraju ispisuje da li je dobitna kombinacija
import java.util.ArrayList;
import java.util.Random;

public class Loto {
    public static void main(String[] args) {
        ArrayList<Integer> odigrani = new ArrayList<Integer>();
        ArrayList<Integer> izvuceni = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 7; i++) {
            odigrani.add(r.nextInt(36) +1);
        }
        for (int i = 0; i < 7; i++) {
            izvuceni.add(r.nextInt(36) + 1);
        }
        System.out.println(odigrani);
        System.out.println(izvuceni);
       if(jednakostNizova(odigrani,izvuceni))
           System.out.println("Ovo je dobitna kombinacija");
       else
           System.out.println("Ovo nije dobitna kombinacija");
    }
    static boolean jednakostNizova(ArrayList nizA, ArrayList nizB) {
        int brojacIzvucenuhBrojeva = 0;
        for (int i = 0; i < nizA.size(); i++) {
            for (int j = 0; j < nizB.size(); j++) {
                if(nizA.get(i)==nizB.get(j)) {
                    brojacIzvucenuhBrojeva ++;
                }
            }

        }
        return brojacIzvucenuhBrojeva == 7;


    }
}
