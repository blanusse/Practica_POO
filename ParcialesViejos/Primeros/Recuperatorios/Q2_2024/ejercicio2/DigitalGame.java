package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio2;

public class DigitalGame extends VideoGame{
    private double gigas;


    public DigitalGame(String name, int year, double gigas){
        super(name, year);
        this.gigas = gigas;
    }


    @Override
    public String toString(){
        return "Physical %s of size %.1f GB".formatted(super.toString(), gigas);
    }
}
