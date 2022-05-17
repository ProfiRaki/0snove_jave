package p16_05_2022;

public class Metod6 {
    public static void main(String[] args) {
        System.out.println(pravougli(3,4,5));
    }

    static boolean pravougli(int a,int b,int c) {
        if(c*c==a*a+b*b)
            return true;
        else
            return false;
    }
}