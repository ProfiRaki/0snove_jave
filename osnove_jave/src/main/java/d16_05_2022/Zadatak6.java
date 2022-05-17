package d16_05_2022;
//      (Za vezbanje)Napisati funkciju koja za tri prosledjena
//        broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku
public class Zadatak6 {
    public static void main(String[] args) {
        System.out.println(min3(3,6,9));
    }

    static int min3(int a,int b,int c){
        int min =b;
        if(a<b){
             if(a<c)
                 min = a;
        }
        else if(b<c)
            min = b;
        else
            min = c;
        return min;
    }
}
