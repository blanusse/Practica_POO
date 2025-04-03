package Taller.Taller2.Ej3;

public class FixedSubwayCard extends SubwayCard{
    private int rides;

    public FixedSubwayCard(SubwayCentral sc, int rides){
        super(sc);
        this.rides = rides;
    }
    @Override
    protected boolean canRide(){
        return rides>0;
    }
    @Override
    public void ride(){
        if(!canRide()){
            System.err.println("No more trips");
        }
        rides--;
    }
}
