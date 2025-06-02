package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio3;

public class MemberPass {
    private String name;
    private double toPay;
    private int rentAmount;

    public MemberPass(String name){
        this.name = name;
        this.toPay = 0;
        this.rentAmount = 0;
    }

    private boolean canRide(BikeType type){
        return type.getPreviousRents() <= this.rentAmount;
    }

    public void ride(BikeType type){
        if(!canRide(type)){
            throw new CannotRideBikeException();
        }
        this.toPay += type.getCost();
        this.rentAmount ++;
    }

    @Override
    public String toString(){
        return "Member Bike Pass used %d times for %s with $%.2f balance".formatted(rentAmount, name, toPay);
    }
}
