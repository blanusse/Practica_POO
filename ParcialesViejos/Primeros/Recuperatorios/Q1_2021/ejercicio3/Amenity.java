package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio3;

public enum Amenity {
    CLEANING(300),
    FUMIGATION(100),
    POOL(200) {
        @Override
        public int getCost(int amb) {
            return 200;
        }
    }
    ;

    private final int cost;

    Amenity(int cost){
        this.cost = cost;
    }


    public int getCost(int amb){
        return cost*amb;
    }
}
