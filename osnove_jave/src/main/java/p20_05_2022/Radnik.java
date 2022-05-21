package p20_05_2022;

//       2.Zad Kreirati klasu Radnik koja ima:
//        jmbg radnika
//        ime i prezime
//        broj dece (1,2,3,... ili 0 ako nema dece)
//        stepen strucne spreme (od 1 do 8)
//        godine radnog staza
//        konstuktor koji postavlja samo jmbg
//        konstuktor koji postavlja sve atribute

public class Radnik {
    public int jmbg;
    public String punoIme;
    public int brojDece;
    public String sSS;
    public int radniStaz;
    public Radnik(int jmbg){
        this.jmbg = jmbg;
    }
    public Radnik(int jmbg, String punoIme, int brojDece, String sSS, int radniStaz){
        this.jmbg = jmbg;
        this.punoIme = punoIme;
        this.brojDece = brojDece;
        this.sSS = sSS;
        this.radniStaz = radniStaz;
    }
//    metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//    metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//    metodu koja racuna platu radnika, plata se racuna po formuli:
//            25000 + (koeficijent slozenosti + minuli rad) * 10000
        public double minuliRad(){
            if(radniStaz<=10)
                return radniStaz * 0.05;
            else if(radniStaz<=20)
                return 10 * 0.05 + (radniStaz - 10) * 0.075;
            return 10 * 0.05 + 10 * 0.075 + (radniStaz - 20) * 0.1;
        }
        public double koeficijentSloz(){
            if(sSS.equals("I"))
                return 1.03;
            else if(sSS.equals("II"))
                return 1.65;
            else if(sSS.equals("III"))
                return 2.00;
            else if(sSS.equals("IV"))
                return 2.27;
            else if (sSS.equals("V"))
                return 2.88;
            else if (sSS.equals("VI"))
                return 3.09;
            else if (sSS.equals("VII"))
                return 3.40;
            return 4.12;
        }
        public double plata(){
            return 25000 + (this.koeficijentSloz() + this.minuliRad() )*1000;
        }




}
