package Vezbe;

import java.util.Scanner;

//        2. Napisati program koji simulira korigovanje jacine zvuka na jutjubu.
//        Podrazumevana vrednost za jacinu zvuka, u trenutku kada se ucita video, je 75%. Korisnik
//        unosi akcije koje uticu na jacinu zvuka sve dok ne unese PLAY. Dozvoljene akcije su:
//        ● up - akcija povecava jacinu zvuka za 10%
//        ● down - akcija smanjuje jacinu zvuka za 10%
//        ● mute - akcije postavlja jacinu zvuka na 0%
//        Jacina zvuka u bilo kom trenutku maksimalno moze biti 100% i minimalno 0%.Na kraju
//        programa ispisati jacinu zvuka
//    BONUS ● unmute - ako ide posle mute vraca na vrednost pre mute, ako predhodna akcija nije nute vraca 75
public class JacinaZvuka {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jacinaZvuka = 75;
        int jacinaPreMute = 0;
        boolean identifikatorMute = false;
        System.out.print("Unesi akciju (up, down, mute): ");
        String akcija = s.next();
        while (!akcija.equals("PLAY")) {
            if (akcija.equals("up"))
                if (jacinaZvuka > 90) {
                    jacinaZvuka = 100;
                    identifikatorMute = false;
                } else {
                    jacinaZvuka += 10;
                    identifikatorMute = false;
                }
            else if (akcija.equals("down"))
                if (jacinaZvuka < 10) {
                    jacinaZvuka = 0;
                    identifikatorMute = false;
                } else {
                    identifikatorMute = false;
                    jacinaZvuka -= 10;
                }
            else if (akcija.equals("mute")) {
                jacinaPreMute = jacinaZvuka;
                jacinaZvuka = 0;
                identifikatorMute = true;
            } else if (akcija.equals("unmute"))
                if (identifikatorMute) {
                    jacinaZvuka = jacinaPreMute;
                    identifikatorMute = false;
                } else {
                    jacinaZvuka = 75;
                    identifikatorMute = false;
                }


            System.out.print("Unesi akciju (up, down, mute, unmute, PLAY): ");
            akcija = s.next();
        }
        System.out.println("Trenutna jacina zvuka je: " + jacinaZvuka);
    }

}
