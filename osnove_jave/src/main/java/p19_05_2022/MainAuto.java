package p19_05_2022;

public class MainAuto {
    public static void main(String[] args) {
        Auto jugo = new Auto();
        Auto honda = new Auto();
        jugo.vozac = "Pe Peic";
        jugo.marka = "Zastava jugo";
        jugo.brojVrata = 3;
        jugo.potrosnja = 8.00;
        jugo.trenutnaBrzina = 180;
        jugo.godProizvodnje = 1998;
        jugo.mesecRegistracije = 7;
        jugo.kubikaza = 1600;
        jugo.stampaj();
        honda.vozac = "Li Liic";
        honda.marka = "Honda Civic";
        honda.brojVrata = 5;
        honda.potrosnja = 5.5;
        honda.trenutnaBrzina = 180;
        honda.stampaj();
        System.out.println(jugo.prekoracio(160));
        System.out.println(jugo.kazna(170));
        jugo.klima = true;
        jugo.dodajGas();
        jugo.koci();
        System.out.println(jugo.potrosnja());
        if(jugo.oldtimer())
            System.out.println("Je oldtimer");
        else
            System.out.println("Nije oldtimer");
        if(jugo.isteklaRegistracija(8))
            System.out.println("Registracija je istekla");
        else
            System.out.println("Registracija nije istekla");
        System.out.println("Cena registracije je: " + jugo.cenaRegistracije());
        if(jugo.istaBrzina(honda))
            System.out.println("Honda mozes ti to");


    }
}
