package ParcialesViejos.Primeros.Q2_2023.ejericio2;

public class Lounge{
    private LoungeCentral central;
    private int guests;
    private String loungeName;

    public Lounge(LoungeCentral central, String loungeName){
        this.central = central;
        this.loungeName = loungeName;
        this.guests = 0;
    }

    public boolean canEnter(Passenger passenger){
        return (central.isOpen() && passenger.getPassAmount() >0);
    }

    public void enter(Passenger passenger) throws LoungeException {
        if(!canEnter(passenger)){
            throw new LoungeException("closed");
        }
        passenger.enterLounge();
        guests++;
    }

    public void exit() throws LoungeException{
        exit(1);
    }

    public void exit(int num) throws LoungeException{
        if(num > guests){
            throw new LoungeException("exit");
        }
        guests--;
    }

    protected String getLoungeName(){
        return loungeName;
    }


    protected int getGuests(){
        return guests;
    }

    @Override
    public String toString(){
        return "%s has %d guests".formatted(loungeName, guests);
    }
}
