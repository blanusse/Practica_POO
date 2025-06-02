package ParcialesViejos.Primeros.Q2_2021.ejercicio3;

public class TicketOffice {
    private int currentId;
    private static final int INITIAL_ID = 1001;

    public TicketOffice(){
        this.currentId = INITIAL_ID;
    }


    private boolean canRide(Ticket ticket, AeroChairType type){
        return ticket.canRide(type);
    }

    public void ride(Ticket ticket, AeroChairType type){
        if(!canRide(ticket, type)){
            throw new RuntimeException("Invalid chairlift for ticket");
        }
        ticket.ride();
    }



    public Ticket buySkiTicket(int maxAmount){
        return new SkiTicket(currentId++, maxAmount);
    }

    public Ticket buyVisitorTicket(int maxAmount){
        return new VisitorTicket(currentId++, maxAmount);
    }
}
