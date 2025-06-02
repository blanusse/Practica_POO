package ParcialesViejos.Primeros.Q1_2022.ejercicio3;

public class CannotVisitAttractionException extends Exception{
    private final String attractionName;

    public CannotVisitAttractionException(String name){
        this.attractionName  =name;
    }

    public String getMessage(){
        return "Cannot visit Attraction %s".formatted(attractionName);
    }
}
