package Taller.Taller3.ej1;

public abstract class SubwayCard {
    private SubwayCentral sc;

    public SubwayCard(SubwayCentral sc){
        this.sc = sc;
    }

    protected abstract boolean canRide();

    public abstract void ride();

    protected SubwayCentral getSubwayCentral(){
        return sc;
    };

}
