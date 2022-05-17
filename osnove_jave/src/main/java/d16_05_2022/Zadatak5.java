package d16_05_2022;
//       (Za vezbanje )Napisati funkciju koja za pronalazi
//        koliko ima celih brojeve izmedju brojeva M i N.

public class Zadatak5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        System.out.println("Izmedju " + a + " i "+ b + "ima " + celihIzmadju(a,b));
    }
    static int celihIzmadju(int m,int n){
        return n-m-1;
    }
}
