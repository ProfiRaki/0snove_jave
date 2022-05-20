package d19_05_2022;
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//        vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400di
//        za tezinu preko 500g, postarina iznosi 1000din


public class Proizvod {
    String naziv;
    double cena;
    double tezina;
    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + " din. "+ this.tezina + "g");
    }
    public void povecajCenu(double povecanje){
        this.cena += povecanje;
    }
    public double vratiCenuSaPopustom(double popust){
        return this.cena -popust;
    }
    public double racunajPostarinu(){
        if(this.tezina<=100)
            return 200;
        else if(this.tezina<=500)
            return 400;
        return 1000;
    }

}
