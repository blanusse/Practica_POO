package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_2Q.ej2;

public enum Types {
    NONE(0), LEVEL1(4), LEVEL2(8);

    private int minCharacters;

    Types(int minCharacters){
        this.minCharacters = minCharacters;
    }


    public boolean isValidPassword(String password){
        return password.length() > this.minCharacters;
    }


}
