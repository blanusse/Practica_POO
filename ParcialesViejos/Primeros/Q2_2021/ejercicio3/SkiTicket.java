package ParcialesViejos.Primeros.Q2_2021.ejercicio3;

public class SkiTicket  extends Ticket{

    public SkiTicket(int id, int rides){
        super(id, rides);
    }


    public boolean canRide(AeroChairType type){
        return true;
    }


    @Override
    public String toString(){
        return "Ski %s".formatted(super.toString());
    }
}
