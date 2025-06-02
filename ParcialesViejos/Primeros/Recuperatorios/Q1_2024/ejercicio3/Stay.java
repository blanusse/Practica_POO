package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio3;

public class Stay {
    private String plate;
    private int days;

    public Stay(String plate, int days){
        this.plate = plate;
        this.days = days;
    }

    public String getPlate(){
        return plate;
    }
    public int getDays(){
        return days;
    }

    @Override
    public String toString(){
        return "Stay %s with %d parking days".formatted(plate, days);
    }
}
