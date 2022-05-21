package Vezbe;

public class Key_value {
    public static void main(String[] args) {
        String url = "https://www.youtube.com/watch";
        String prvaDopuna = insertKeyValue(url, "v", "SPtywMQMymI");
        System.out.println(prvaDopuna); // metoda stampa https://www.youtube.com/watch?v=SPtywMQMymI
        String drugaDopuna = insertKeyValue(prvaDopuna, "ab_channel", "JenniferLopezVEVO");
        System.out.println(drugaDopuna ); // metoda stampa https://www.youtube.com/watch?v=SPtywMQMymI&ab_channel=JenniferLopezVEVO
        String trecaDopuna= insertKeyValue(drugaDopuna, "skola", "ITBootcamp");
        System.out.println(trecaDopuna); // metoda stampa https://www.youtube.com/watch?v=SPtywMQMymI&ab_channel=JenniferLopezVEVO&skola=ITBootcamp

    }
    static String insertKeyValue(String baseUrl, String key, String value){
        int i = 0;
        while(!(baseUrl.charAt(i) == '=') && i < baseUrl.length()-1){
            i++;
            baseUrl.charAt(i);
        }
        boolean prviDeoNemaZnakJednakosti = false;
        if(i==baseUrl.length() -1)
            prviDeoNemaZnakJednakosti = true;

        boolean znakPitanjaJeNaKraju = false;
        if(baseUrl.charAt(baseUrl.length()-1) == '?')
            znakPitanjaJeNaKraju = true;

        if(!znakPitanjaJeNaKraju)
            baseUrl += "?";
        if(prviDeoNemaZnakJednakosti)
             return baseUrl + key + "=" + value;
        else
            return baseUrl + "&" + key + "=" + value;



    }
}
