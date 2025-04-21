package ParcialesViejos.Q2_2021.ejercicio3;

public enum aerochair {
    AMANCAY(true, false),
    HORSETOOTH(true, true),
    SIXFOLD(true, false);

    private boolean forSky;
    private boolean forVisitors;

    aerochair(boolean forSky, boolean forVisitors){
        this.forSky = forSky;
        this.forVisitors = forVisitors;
    }

    public boolean isForSky(){
        return forSky;
    }

    public boolean isForVisitors(){
        return forVisitors;
    }
}
