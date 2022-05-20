package d19_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning k = new SmartAirConditioning();
        k.marka = "Samsung";
        k.potrosnjaHladjenja = 1;
        k.potrosnjaGrejanja = 2;
        k.izabranaTemperatura = 22;
        k.mod = "hladi";
        k.stampaj();
        System.out.println("Potroseno KW " + k.potrosnjaUKw());
        System.out.println("Racun je " +k.potrosnjaUDinarima());
    }
}
