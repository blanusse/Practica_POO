package ParcialesViejos.Primeros.Q1_2023.ejercicio3;

public class Device extends Product{
    private Energy energyPlan;


    public Device(String name, Brand brand, double basePrice, Energy energyPlan) {
        super(name, brand, basePrice);
        this.energyPlan = energyPlan;
    }
}
