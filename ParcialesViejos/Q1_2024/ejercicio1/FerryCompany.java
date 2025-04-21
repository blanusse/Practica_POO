package ParcialesViejos.Q1_2024.ejercicio1;

public class FerryCompany {
    private final String name;
    public FerryCompany(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FerryCompany ferrycompany && name.equals(ferrycompany.name);
    }
}
