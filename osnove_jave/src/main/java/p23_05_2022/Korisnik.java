package p23_05_2022;
//        ime
//        prezime
//        gettere i settere za ime i prezime
//        konstuktore koje mislite da su vam potrebni
//        metoda koja stampa u formatu:
//        (ime) (prezime)


public class Korisnik {
            private String ime;
            private String prezime;
            public String getIme(){
                return this.ime;
            }
            public String getPrezime(){
                return this.prezime;
            }
            public void setIme(String ime){
                this.ime = ime;
    }
            public void setPrezime(){
                this.prezime = prezime;
            }
            public Korisnik(String ime, String prezime){
                this.ime = ime;
                this.prezime = prezime;
            }
            public void stampaj(){
                System.out.println(this.ime + " " + this.prezime);
            }

}
