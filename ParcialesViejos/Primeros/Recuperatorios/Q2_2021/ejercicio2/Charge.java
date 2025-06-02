package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio2;

public enum Charge {
    PART_TIME(100, 0),
    FULL_TIME(200, 10),
    DIRECTOR(300, 20);

    private int hourAmount;
    private int bonus;

    Charge(int hourAmount, int bonus){
        this.bonus = bonus;
        this.hourAmount = hourAmount;
    }

    public int getSalary(int hours, int age){
        return hourAmount * hours + age * bonus;
    }
}
