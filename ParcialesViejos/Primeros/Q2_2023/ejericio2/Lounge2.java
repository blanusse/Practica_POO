package ParcialesViejos.Primeros.Q2_2023.ejericio2;

public class Lounge2 extends Lounge{
    private int passengerLimit;



    public Lounge2(LoungeCentral central, String loungeName, int limit) {
        super(central, loungeName);
        this.passengerLimit = limit;
    }

    @Override
    public boolean canEnter(Passenger passenger){
        return (super.canEnter(passenger) && passengerLimit > this.getGuests());
    }

    @Override
    public String toString(){
        return "%s has %d guests up to %d guests".formatted(getLoungeName(), getGuests(), passengerLimit);
    }
}
