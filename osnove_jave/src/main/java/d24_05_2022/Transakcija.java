package d24_05_2022;
//       Kreirati klasu Transakcija koja ima:
//        id transakcije
//        racun sa kog se prenose sredstva
//        racun na koji se prenose sredstva
//        gettere i settere
//        konstruktore
//        privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//        ako je prenos sredstava manji od 4500, provizija je fiksna 45
//        ako je prenos sredstava veci od 4500, provizija je 1%
//        S obzirom da se provizija racuna na osnovu visine transakcije,
//        znaci da metoda prima parametar koji predstavlja visinu transakcije
//        Ukoliko ne znate da resite ovu metodu,
//        u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//        metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//        Kao parametar funkcije se unosi vrednost koja se prebacuje.
//        Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//        a na drugi racun dodaje samo (trazena suma).
//        (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//        metodu koja stampa podatke o transakciji u formatu:
//        id transkacije
//        Racun sa: Ime i prezime  -  broj racuna
//        Racun na: Ime i prezime  -  broj racuna


public class Transakcija {
    private int idTransakcije;
    private Racun uplatioc;
    private Racun primaoc;
    public Transakcija(int idTransakcije, Racun uplatioc, Racun primaoc){
        this.idTransakcije = idTransakcije;
        this.uplatioc = uplatioc;
        this.primaoc = primaoc;
    }
    private double provizija(double visinaTransakcije){
        return visinaTransakcije > 4500 ? visinaTransakcije * 0.01 : 45;
    }
    public void izvrsiTransakciju(double visinaTransakcija, Racun uplatioc, Racun primaoc){
        if( uplatioc.getTrenutnoStanje()<visinaTransakcija + provizija(visinaTransakcija))
            visinaTransakcija = uplatioc.getTrenutnoStanje() -
                    provizija(uplatioc.getTrenutnoStanje());
        uplatioc.menjaStane(-(visinaTransakcija + provizija(visinaTransakcija)));
        primaoc.menjaStane(visinaTransakcija);

    }
    public void stampaj(){
        System.out.println(idTransakcije);
        uplatioc.stampaj();
        primaoc.stampaj();
    }

}
