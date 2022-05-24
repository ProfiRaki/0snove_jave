package Vezbe;
//        Kreirati klasu Osoba koja od atributa ima:
//                puno ime
//        oca - otac je takodje Osoba
//        majku - majka je takodje Osoba
//        > A od metoda:
//                gettere i settere za sve atribute
//        konstuktor koji postavlja punoIme, defaultni konstuktor ne treba
//        2 metode za stampu koje cu da vam postavim u threadu
//        > U mainu kreirajte vase porodicno stablo bar do babe i dede i odstampajte osobu koja ste vi.
public class Osoba {
    private String punoIme;
    private Osoba otac;
    private Osoba majka;

    public Osoba(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public Osoba getOtac() {
        return otac;
    }

    public void setOtac(Osoba otac) {
        this.otac = otac;
    }

    public Osoba getMajka() {
        return majka;
    }

    public void setMajka(Osoba majka) {
        this.majka = majka;
    }

    public void print() {
        print("", this, false);
    }

    private void print(String prefix, Osoba n, boolean isLeft) {
        if (n != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + n.punoIme);
            print(prefix + (isLeft ? "|   " : "    "), n.otac, true);
            print(prefix + (isLeft ? "|   " : "    "), n.majka, false);
        }
    }
}