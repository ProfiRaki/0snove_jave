package Vezbe;

public class Obrni {
    public static void main(String[] args) {
        System.out.println(obrni("aca je uvek aca"));
    }
    static String obrni(String str) {
        String rts = "";
        for (int i = 0; i < str.length(); i++) {
            rts = rts + str.charAt(str.length() - 1 - i);
        }
            return rts;

    }
}
