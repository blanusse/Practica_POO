package Taller.Taller2.Ej3;

public class RechargableSubwayCard extends SubwayCard{
    private double balance;

    public RechargableSubwayCard(SubwayCentral sc){
        super(sc);
    }

    public void recharge(double amount){
        this.balance += amount;
    }

    protected double rideCost(){
        return subwayCentral.getRideCost();
    }
    @Override
    public boolean canRide(){
        return balance >= rideCost();
    }
    @Override
    public void ride(){
        if(!canRide()){
            System.err.println("No more trips");
        }
        balance-=rideCost();
    }
}
