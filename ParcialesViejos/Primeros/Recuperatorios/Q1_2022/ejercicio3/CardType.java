package ParcialesViejos.Primeros.Recuperatorios.Q1_2022.ejercicio3;

public enum CardType {
    WELCOME(10, 0),
    GREEN(30, 5),
    GOLD(50, 10);

    private int variablePoints;
    private int fixedPoints;

    CardType(int variablePoints, int fixedPoints){
        this.fixedPoints = fixedPoints;
        this.variablePoints = variablePoints;
    }

    public double purchasePoints(double amount){
        return (this.variablePoints * amount);
    }

    public double getFixedPoints(){
        return fixedPoints;
    }

}
