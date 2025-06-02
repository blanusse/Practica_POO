package ParcialesViejos.Segundos.Q1_2021.ej2;

public class Product implements Comparable<Product>{
    private final String name;
    private final double price;
    private final ProductCategory cat;

    public Product(String name, double price, ProductCategory cat) {
        this.name = name;
        this.price = price;
        this.cat = cat;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCat() {
        return cat;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }
}
