package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio2;

public abstract class VideoGame {
    private String name;
    private int year;

    public VideoGame(String name, int year){
        this.name = name;
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString(){
        return "%s launched int %d".formatted(name, year);
    }
}
