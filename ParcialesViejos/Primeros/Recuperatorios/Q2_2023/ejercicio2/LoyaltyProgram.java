package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio2;

public class LoyaltyProgram {
    private int currentId;
    private boolean promotion;
    private final static int INITIAL_ID = 1001;

    public LoyaltyProgram(){
        this.currentId = INITIAL_ID;
        this.promotion = false;
    }

    public int getCurrentId(){
        return currentId++;
    }

    public void setPromotionIsActive(boolean value){
        this.promotion = value;
    }

    public boolean isPromotionActive(){
        return promotion;
    }
}
