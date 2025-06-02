package ParcialesViejos.Primeros.Recuperatorios.Q1_2022.ejercicio3;

import java.util.function.Function;

public class CoffeeCard {
    private String name;
    private CardType type;
    private int id;
    private double points;
    private Function<Double, Double> promotion;
    private CoffeeRewards rewards;

    public CoffeeCard(CoffeeRewards rewards, String name, CardType type, int id){
        this.id = id;
        this.rewards = rewards;
        this.name = name;
        this.type = type;
        this.points = 0;
    }

    public void setPointsPromotion(Function<Double, Double> promotion){
        this.promotion = promotion;
    }

    public void purchase(Double amount){
        this.points += type.getFixedPoints() + rewards.getPromotion().apply(type.purchasePoints(amount));
    }


//    CoffeeCard 1001 from Mike with 9000 points
    @Override
    public String toString(){
        return "CoffeCard %d from %s with %.0f".formatted(id, name, points);
    }

}
