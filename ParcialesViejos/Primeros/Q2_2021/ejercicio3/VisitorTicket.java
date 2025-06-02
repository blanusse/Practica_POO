package ParcialesViejos.Primeros.Q2_2021.ejercicio3;

public class VisitorTicket extends Ticket{


    public VisitorTicket(int id, int rides){
        super(id, rides);
    }


    public boolean canRide(AeroChairType type){
        return type.isOnlyForSki() == 0;
    }


    @Override
    public String toString(){
        return "Visitor %s".formatted(super.toString());
    }
}
