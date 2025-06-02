package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio3;

public class DiscountCard {
    private String name;
    private double amount;
    private SaraCenter center;

    public DiscountCard(SaraCenter center, String name){
        this.center = center;
        this.name =name;
        this.amount = 0;
    }

    public SaraCenter getCenter(){
        return center;
    }

    public double checkPrice(Product product){
        return product.getPrice() - (center.getHolidayDiscount() * product.getPrice());
    }

    public void buyProduct(Product product){
        amount += checkPrice(product);
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        return "Holiday Card %s of %s spent $%.2f".formatted(name, center.getName(), amount);
    }
}
