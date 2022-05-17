package d16_05_2022;
//        Metoda prima dva parametra N i karakter za stampu.
//        Metoda stampa N karaktera.

public class Zadatak4 {
    public static void main(String[] args) {
        eniranje(5,'/');
    }
    static void eniranje(int n, char karakter){
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);
        }
        System.out.println();
    }
}
