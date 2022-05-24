package p23_05_2022;
//        ime i prezime rezisera
//        starost
//        konstruktore, gettere i settere koji su potrebni
//        metodu print koja stampa podatke u formatu
//        ime prezime, starost.god

public class Reziser {
    private String punoIme;
    private  int starost;
    public String getPunoIme(){
        return this.punoIme;
    }
    public int getStarost(){
        return this.starost;
    }
    public void setPunoIme(String punoIme){
        this.punoIme = punoIme;
    }
    public void setStarost(int starost){
        this.starost = starost;
    }
    public Reziser(String punoIme, int starost){
       this.punoIme = punoIme;
       this.starost = starost;
    }
    public void stampaj(){
        System.out.println(punoIme + ", " + starost + ".god");
    }
}
