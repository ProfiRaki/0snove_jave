package p18_05_2022;

public class MainRacun {
    public static void main(String[] args) {
        Racun r = new Racun();
        double sumaZaTransakciju = 243.00;
        r.brojRacuna = "454545454";
        r.ime = "Lkojiu";
        r.prezime = "Lkojiuic";
        r.stanjrNaRacunu = 5454.67;
        Racun p = new Racun();
        p.brojRacuna = "343434";
        p.ime = "Pera";
        p.prezime = "Peric";
        p.stanjrNaRacunu = 4545.76;

        System.out.println("Posiljaoc: " + r.ime + " " + r.prezime + ", " + "Stanje: " + r.stanjrNaRacunu);
        System.out.println("Posiljaoc: " + p.ime + " " + p.prezime + ", " + "Stanje: " + p.stanjrNaRacunu);

        System.out.println("Suma za transakciju je: " + sumaZaTransakciju);
        r.stanjrNaRacunu -=sumaZaTransakciju;
        p.stanjrNaRacunu +=sumaZaTransakciju;
        System.out.println("Posiljaoc: " + r.ime + " " + r.prezime + ", " + "Stanje: " + r.stanjrNaRacunu);
        System.out.println("Posiljaoc: " + p.ime + " " + p.prezime + ", " + "Stanje: " + p.stanjrNaRacunu);

        }
    }

