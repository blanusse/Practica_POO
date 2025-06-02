package ParcialesViejos.Segundos.Q1_2021.ej2;

public enum ProductCategory {
    ELECTRONICS(80, 1.1), BOOKS(30, 0), GROCERY(5, 1.25);

    private final int points;
    private final double multiplier;

    ProductCategory(int points, double multiplier) {
        this.points = points;
        this.multiplier = multiplier;
    }

    public int getPoints() {
        return points;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
