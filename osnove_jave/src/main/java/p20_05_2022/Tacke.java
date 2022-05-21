package p20_05_2022;

public class Tacke {
    public  int x;
    public  int y;
    public Tacke(int x, int y){
        this.x = x;
        this.y = y;
    }
    public  Tacke(){

    }
    public void stampaj(){
        System.out.println("Tacka (x,y) = (" + this.x + "," + this.y + ")");
    }
}
