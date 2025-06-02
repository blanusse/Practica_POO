package ParcialesViejos.Primeros.Q1_2023.ejercicio3;

public enum Energy {
    PLAN_A(0),
    PLAN_B(0.1),
    PLAN_C(0.2);

    private final double rate;

    Energy(double rate){
        this.rate = rate;
    }

    public double getTax(double price){
        return price*rate;
    }

    @Override
    public String toString(){
        return "Energy label %s".formatted(rate);
    }
}
