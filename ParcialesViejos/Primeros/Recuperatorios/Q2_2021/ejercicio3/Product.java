package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio3;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product %s", name);
    }
}