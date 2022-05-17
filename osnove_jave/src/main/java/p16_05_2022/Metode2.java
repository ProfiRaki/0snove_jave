package p16_05_2022;

public class Metode2 {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            zvezdanje(i);
            System.out.println();
        }


    }
    static void zvezdanje(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }

}
