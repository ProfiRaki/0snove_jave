package Radnici;
//       Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//        override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.


public class Menadzer extends Radnik{
    @Override
    public double plata(){
        int suma = 0;
        for (int i = 0; i < sektori.size(); i++) {
            suma += sektori.get(i).getPlataZaSektor();
        }
        return suma;

    }
}
