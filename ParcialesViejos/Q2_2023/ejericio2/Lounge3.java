package ParcialesViejos.Q2_2023.ejericio2;

public class Lounge3 extends Lounge2{
    private String onlyAirline;


    public Lounge3(LoungeCentral central, String loungeName, int limit, String airline) {
        super(central, loungeName, limit);
        this.onlyAirline = airline;
    }

    @Override
    public boolean canEnter(Passenger passenger){
        return (super.canEnter(passenger) && passenger.getAirline().equals(onlyAirline));
    }

    @Override
    public String toString(){
        return "%s %s".formatted(onlyAirline, super.toString());
    }

}
