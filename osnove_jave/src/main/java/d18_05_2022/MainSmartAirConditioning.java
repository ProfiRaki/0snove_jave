package d18_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning s1 = new SmartAirConditioning();
        SmartAirConditioning s2 = new SmartAirConditioning();
        s1.marka = "Samsung";
        s1.izabranaTemperatura = 21;
        s1.mod = "Hladi";
        SmartAirConditioning.stampaj(s1.marka, s1.izabranaTemperatura, s1.mod);
        s2.marka = "Galanz";
        s2.izabranaTemperatura = 22;
        s2.mod = "Hladi";
        SmartAirConditioning.stampaj(s2.marka, s2.izabranaTemperatura, s2.mod);
    }
}
