package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio3;

public abstract class FunctionalUnit {
    private String name;
    private int sqmeters;
    private Building building;

    public FunctionalUnit(Building building, String name, int sqmeters){
        this.building = building;
        this.name = name;
        this.sqmeters = sqmeters;
    }

    public int getSqmeters() {
        return sqmeters;
    }

    public Building getBuilding() {
        return building;
    }

    public double getAmount(){
        return sqmeters*building.getM2Expense();
    }

    public Amenity[] getAmenities(){
        return building.getAmenities();
    }

    @Override
    public String toString(){
        return "U.F %s (%d m2) : ".formatted(name, sqmeters);
    }
}
