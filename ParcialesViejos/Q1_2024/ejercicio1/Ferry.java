package ParcialesViejos.Q1_2024.ejercicio1;

public class Ferry {
    private final String name;
    private final FerryCompany company;
    private boolean isDocked;



    public Ferry(String name, FerryCompany c) {
        this.name = name;
        this.company = c;
        this.isDocked = false;
    }


    public FerryCompany getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Ferry %s"
                .formatted(name);
    }

}
