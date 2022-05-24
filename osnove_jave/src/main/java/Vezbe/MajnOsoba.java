package Vezbe;

public class MajnOsoba {
    public static void main(String[] args) {
        Osoba n = new Osoba("Dragan Radosevic");
        Osoba n1 = new Osoba("Dane Radosevic");
        Osoba n2 = new Osoba("Milanka Radosevic");
        Osoba n3 = new Osoba("Dragan Radosevic");
        Osoba n4 = new Osoba("Marija Radosevic");
        Osoba n5 = new Osoba("Jovan Spasic");
        Osoba n6 = new Osoba("Ruza Spasic");
        n.setOtac(n1) ;
        n1.setOtac(n3);
        n1.setMajka(n4);
        n.setMajka(n2);
        n2.setOtac(n5);
        n2.setMajka(n6);
        n.print();
 //       n.print("", n1, false);
    }
}
