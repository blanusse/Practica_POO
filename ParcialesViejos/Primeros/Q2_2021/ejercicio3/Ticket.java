package ParcialesViejos.Primeros.Q2_2021.ejercicio3;

public abstract class Ticket {
    private int id;
    private int rides;


    public Ticket(int id, int rides){
        this.rides = rides;
        this.id = id;
    }

    public void ride(){
        rides--;
    }

    public abstract boolean canRide(AeroChairType type);


    @Override
    public String toString(){
        return "Ticket %d has %d rides left".formatted(id, rides);
    }
}
