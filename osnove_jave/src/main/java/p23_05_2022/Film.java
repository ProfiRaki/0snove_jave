package p23_05_2022;
//        Kreirati klasu Film koja ima:
//        naziv filma
//        iz koje godine je film
//        konstruktore, gettere i settere koji su potrebni
//        metodu print koja stampa podatke u formatu
//        naziv filma, godina

public class Film {
    private String nazivFilma;
    private int godiste;
    public String getNazivFilma(){
        return this.nazivFilma;
    }
    public int getGodiste(){
        return  this.godiste;
    }
    public void setNazivFilma(String nazivFilma){
        this.nazivFilma = nazivFilma;
    }
    public void setGodiste(int godiste){
        this.godiste = godiste;
    }
    public void stampaj(){
        System.out.println("Film " + nazivFilma + " iz " + godiste + "god");
    }
    public Film(String nazivFilma, int godiste){
        this.nazivFilma = nazivFilma;
        this.godiste = godiste;
    }


}
