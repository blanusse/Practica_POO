package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio3;

public class Building {
    private Amenity[] amenities;

    // Costo por metro cuadrado de las U.F. residenciales y comerciales
    private double m2Expense = 100.0;
    // Multiplicador sobre total para las U.F. comerciales
    private double commercialMult = 3.0;

    public double getM2Expense() {
        return m2Expense;
    }

    public void setM2Expense(double m2Expense) {
        this.m2Expense = m2Expense;
    }

    public double getCommercialMult() {
        return commercialMult;
    }

    public void setCommercialMult(double commercialMult) {
        this.commercialMult = commercialMult;
    }

    public void setAmenities(Amenity[] amenities){
        this.amenities = amenities;
    }



    public FunctionalUnit newResidentialFunctionalUnit(String name, int sqmeters, int amb){
        return new ResidentialFunctionalUnit(this, name, sqmeters, amb);
    }

    public FunctionalUnit newCommercialFunctionalUnit(String name, int sqmeters){
        return new CommercialFunctionalUnit(this, name, sqmeters);
    }

    public Amenity[] getAmenities(){
        return amenities;
    }
}