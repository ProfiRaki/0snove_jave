package p19_05_2022;
//        Kreirati klasu Auto koja ima:
//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 10)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//        [Vozac]
//        [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//        [Trenutna brzina auta] km/h je trenutna brzina

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public int trenutnaBrzina;
    public String brojRegistracije;
    public void stampaj() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata" + this.brojRegistracije);
        System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trnutna brzina");
    }
//        metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//        Kao parametar metode se prima ogranicenje (kao broj)
//        a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//                metoda koja vraca visinu novcane kazne za prekoracenje,
//                za svaku jedinicu prekoracenja placa se 1000din.
//            Metoda od parametara prima ogranicenje brzine
        public boolean prekoracio(int ogranicenje){
            return trenutnaBrzina>ogranicenje;

    }
        public int kazna(int ograhicenje){
            if(this.trenutnaBrzina>ograhicenje)
                return (this.trenutnaBrzina-ograhicenje)*1000;
            else
                return 0;
    }
//            atribut broj registracije
//            da li je ukljucena klima u autu
//            metodu dodajGas, koja povecava trenutnu brzinu za 10.
//            metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//                    metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//            faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//            (trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime



            public boolean klima;
            public void dodajGas(){
                this.trenutnaBrzina = this.trenutnaBrzina + 10;
            }
            public void koci(){
                if(this.trenutnaBrzina<10)
                    this.trenutnaBrzina = 0;
                else
                    this.trenutnaBrzina -= 10;

            }
            public double potrosnja(){
                if(klima)
                    return this.trenutnaBrzina/100.0 * this.potrosnja * 1.2;
                    return this.trenutnaBrzina/100.0 * this.potrosnja;
            }
//    Dopuniti klasu Auto tako da ima:
//    atribut godinu proizvodnje
//    atribut mesec do kad je registrovan auto (int)
//    atribut kubikaza auta (npr: 1600 - 5000)
//    metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//    metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//    metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

            public int godProizvodnje;
            public int mesecRegistracije;
            public int kubikaza;
            public boolean oldtimer(){
                return this.godProizvodnje<1950;
            }
            public boolean isteklaRegistracija(int trenutniMesec){
                return this.mesecRegistracije<trenutniMesec;
            }
            public double cenaRegistracije(){
                if(this.kubikaza>2000)
                    return this.kubikaza * 100 *1.3;
                return this.kubikaza * 100 * 1.0;
            }
        //    Dopuniti klasu Auto tako da ima:
        //    kapacitet rezervoara
        //    trenutnu kolicinu goriva u rezervoaru (u litrima)
        //    metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se
        //    toci a vraca novcanu vrednost goriva. Litar goriva je 170din.
        //    Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
        //    takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.
            public int kapacitetRezervoara;
            public int gorivoURezervoaru;
            public int natociGorivo(int litrazaTocenja){
                if((this.kapacitetRezervoara-this.gorivoURezervoaru)>=litrazaTocenja)
                    return litrazaTocenja * 170;
                return (this.kapacitetRezervoara -this.gorivoURezervoaru)*170;
            }
//    Dopuniti klasu Auto, tako da ima
//    metodu koja vraca da li auto nad kojim je pozvana metoda ide istom
//    brzinom kao i auto sa kojim se poredi. Ova metoda poredi brzinu sa
//    drugim autom, i parametar metode treba da bude tipa Auto.
//    HINT: Ova metoda treba da se ponasa kao metoda equals za stringove.
//    Zovemo metodu nad jednim stringom i poredimo ga sa drugim,
//    tako i ovde zovemo metodu nad jednim autom i poredimo ga sa drugim
//            (NE SA BRZINOM DRUGOG, NEGO BAS SA AUTOM)
            public boolean istaBrzina(Auto a2){
                return this.trenutnaBrzina == a2.trenutnaBrzina;
            }
}

