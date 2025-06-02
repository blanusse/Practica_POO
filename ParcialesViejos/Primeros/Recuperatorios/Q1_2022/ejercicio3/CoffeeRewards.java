package ParcialesViejos.Primeros.Recuperatorios.Q1_2022.ejercicio3;

import java.util.function.Function;

public class CoffeeRewards {
    private final static int INITIAL_ID = 1001;
    private int currentId = INITIAL_ID;
    private Function<Double, Double> promotion;

    public CoffeeRewards(Function<Double, Double> promotion){
        this.promotion = promotion;
    }

    public CoffeeCard buildCard(String name, CardType type){
        return new CoffeeCard(this, name, type, currentId++);
    }

    public void setPointsPromotion(Function<Double, Double> promotion){
        this.promotion = promotion;
    }

    public Function<Double, Double> getPromotion(){
        return promotion;
    }


}
