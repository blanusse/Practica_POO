package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio3;

public abstract class Coin {
    private String name;
    private String country;
    private int year;


    public Coin(String name, String country, int year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "%s of %s minted in %d".formatted(name, country, year);
    }
}
