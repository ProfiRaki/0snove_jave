package p16_05_2022;

public class Metoda4 {
    public static void main(String[] args) {
       apsolutnaVrednost(-5);
    }
    static void apsolutnaVrednost(int a){
        if (a<0)
            System.out.println(-a);
        else
            System.out.println(a);
    }
}
