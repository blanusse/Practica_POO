package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio2;

public class BuyerLevelProgram {
    private int currentId;
    private final static int INITIAL_ID = 1001;
    private boolean upgrade;

    public BuyerLevelProgram(){
        this.currentId = INITIAL_ID;
        this.upgrade = false;
    }

    public int getCurrentId(){
        return currentId++;
    }

    public void disableLevelUp(){
        this.upgrade = false;
    }

    public void enableLevelUp(){
        this.upgrade = true;
    }

    public boolean isEnabled(){
        return upgrade;
    }
}
