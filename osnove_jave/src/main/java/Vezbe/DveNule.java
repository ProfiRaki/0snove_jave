package Vezbe;

import java.util.Scanner;

//       Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
  //      zaredom.Na kraju programa ispisati sumu unetih brojeva
public class DveNule {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        boolean nemaPrveNule = true;
        boolean nemaDveNule = true;
        while(nemaDveNule){
            System.out.print("Unesi broj: ");
            int broj = s.nextInt();
            suma = suma + broj;
            if(broj==0 && nemaPrveNule)
                nemaPrveNule = false;
            else if (broj==0)
                nemaDveNule = false;
            else
                nemaPrveNule = true;

        }
        System.out.println("Suma je: " + suma);

    }
}
