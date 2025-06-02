package ParcialesViejos.Primeros.Q2_2023.ejericio2;

public class Passenger {
    private String name;
    private String airline;
    private int passAmount;

    public Passenger(String name, String airline, int passAmount){
        this.airline = airline;
        this.name = name;
        this.passAmount = passAmount;
    }

    public String getAirline(){
        return airline;
    }

    public int getPassAmount(){
        return passAmount;
    }

    public void enterLounge(){
        passAmount--;
    }
}
