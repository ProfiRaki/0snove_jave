package d31_05_2022;
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja
//        difoltni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)

public class Osoba {
    protected String imePrezime;
    protected String jmbg;
    protected int godinaRodjenja;
    public Osoba(){

    }

    public Osoba(String imePrezime, String jmbg, int godinaRodjenja){
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj(){
        System.out.println(imePrezime + ", " + jmbg + ", " + godinaRodjenja);
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
}
