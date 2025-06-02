package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio3;

public class GoldCoin extends Coin{
    private int qil;

    public GoldCoin(String name, String country, int year, int qil) {
        super(name, country, year);
        this.qil = qil;
    }

    @Override
    public String toString(){
        return "Gold Coin %s with %d karats".formatted(super.toString(), qil);
    }
}
