package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio3;

public class MemberCard extends DiscountCard{
    private double points;

    public MemberCard(SaraCenter center, String name){
        super(center, name);
        this.points = 0;
    }


    private boolean isFree(Product product){
        return product.getPrice() <= points;
    }

    @Override
    public double checkPrice(Product product){
        if(isFree(product)){
            return 0;
        }
        return product.getPrice() - (this.getCenter().getMemberDiscount() * product.getPrice());
    }

    @Override
    public void buyProduct(Product product){
        if(isFree(product)){
            this.points -= product.getPrice();
            return;
        }
        super.buyProduct(product);
        this.points += (0.5 * product.getPrice());
    }

    @Override
    public String toString(){
        return "Member Card %s of %s spent $%.2f has %.2f points".formatted(this.getName(), this.getCenter().getName(), this.getAmount(), points);
    }
}
