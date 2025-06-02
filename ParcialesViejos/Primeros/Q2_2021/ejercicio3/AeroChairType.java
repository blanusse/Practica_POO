package ParcialesViejos.Primeros.Q2_2021.ejercicio3;

public enum AeroChairType {
    AMANCAY(1), HORSETOOTH(0), SIXFOLD(1);

    private int isOnlyForSki;

    AeroChairType(int isOnlyForSki){
        this.isOnlyForSki = isOnlyForSki;
    }

    public int isOnlyForSki(){
        return isOnlyForSki;
    }
}
