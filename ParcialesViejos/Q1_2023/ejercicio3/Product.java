package ParcialesViejos.Q1_2023.ejercicio3;

public abstract class Product {
    private String name;
    private Brand brand;
    private double basePrice;

    public Product(String name, Brand brand, double basePrice){
        this.brand = brand;
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getFinalPrice(){
        return brand.applyDiscount(basePrice);
    }
}
