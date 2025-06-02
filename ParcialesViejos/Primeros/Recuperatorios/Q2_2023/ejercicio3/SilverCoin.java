package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio3;

public class SilverCoin extends Coin{


    public SilverCoin(String name, String country, int year) {
        super(name, country, year);
    }

    @Override
    public String toString(){
        return "Silver Coin %s".formatted(super.toString());
    }
}
