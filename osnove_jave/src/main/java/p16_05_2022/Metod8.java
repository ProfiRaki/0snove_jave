package p16_05_2022;

public class Metod8 {
    public static void main(String[] args) {
        System.out.println(konverzija("VI"));

    }
    static int konverzija(String arapski){
        if(arapski.equals("I"))
            return 1;
        else if(arapski.equals("II"))
            return 2;
        else if(arapski.equals("III"))
            return 3;
        else if(arapski.equals("IV"))
            return 4;
        else if(arapski.equals("V"))
            return 5;
        else if(arapski.equals("VI"))
            return 6;
        else if(arapski.equals("VII"))
            return 7;
        else if(arapski.equals("VIII"))
            return 8;
        else if(arapski.equals("IX"))
            return 9;
        else if(arapski.equals("X"))
            return 10;
        else
            return 0;
    }
}
