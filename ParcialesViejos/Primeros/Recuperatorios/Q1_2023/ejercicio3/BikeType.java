package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio3;

public enum BikeType {
    CLASSIC(100, 0),
    ELECTRIC(150, 3);

    private int cost;
    private int previousRents;


    BikeType(int cost, int previousRents){
        this.cost = cost;
        this.previousRents = previousRents;
    }


    public int getCost(){
        return cost;
    }
    public int getPreviousRents(){
        return previousRents;
    }
}
