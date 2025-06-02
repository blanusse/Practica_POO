package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio3;

public class VisitorsPass {
    private int maxRent;
    private int rentAmount;

    public VisitorsPass(int maxRent){
        this.maxRent = maxRent;
        this.rentAmount = 0;
    }

    private boolean canRide(BikeType type){
        return type.getPreviousRents() <= this.rentAmount && this.rentAmount < maxRent;
    }

    public void ride(BikeType type){
        if(!canRide(type)){
            throw new CannotRideBikeException();
        }
        this.rentAmount++;
    }

    @Override
    public String toString(){
        return "Visitor Bike Pass used %d times with %d max rides".formatted(rentAmount, maxRent);
    }


}
