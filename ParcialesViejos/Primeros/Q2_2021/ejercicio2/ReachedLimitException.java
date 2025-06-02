package ParcialesViejos.Primeros.Q2_2021.ejercicio2;

public class ReachedLimitException extends Exception{
    private final int max;

    public ReachedLimitException(int max){
        this.max = max;
    }

    public String getMessage(){
        return "Reached Limit of %d people".formatted(max);
    }

}
