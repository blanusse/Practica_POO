package ParcialesViejos.Primeros.Q1_2023.ejercicio3;

public class Accesories extends Product {
    private String description;


    public Accesories(String name, Brand brand, double basePrice, String desc) {
        super(name, brand, basePrice);
        this.description =desc;
    }


}
