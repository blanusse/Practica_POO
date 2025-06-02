package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio3;

public class ResidentialFunctionalUnit extends FunctionalUnit {
    private int amb;
    private Amenity amenities;


    public ResidentialFunctionalUnit(Building building, String name, int sqmeters, int amb){
        super(building, name, sqmeters);
        this.amb = amb;
    }

    private double calculateAmenities() {
        double total = 0;
        if(getAmenities() != null) {
            for (Amenity amenity : getAmenities()) {
                total += amenity.getCost(amb);
            }
        }
        return total;
    }

    @Override
    public double getAmount(){
        return (super.getAmount())*amb + calculateAmenities();
    }


    @Override
    public String toString(){
        return "Residencial: %s : %.2f".formatted(super.toString(), getAmount());
    }

}
