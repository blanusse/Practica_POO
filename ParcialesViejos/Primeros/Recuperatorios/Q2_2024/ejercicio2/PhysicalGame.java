package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio2;

public class PhysicalGame extends VideoGame{
    private String local;

    public PhysicalGame(String name, int year, String local){
        super(name, year);
        this.local = local;
    }

    @Override
    public String toString(){
        return "Physical %s buyed at %s".formatted(super.toString(), local);
    }

}
