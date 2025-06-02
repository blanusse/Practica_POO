package ParcialesViejos.Primeros.Q2_2024.ejercicio3;

public class RentalException extends Exception{
    private String type;

    public RentalException(String type){
        this.type = type;
    }

    public String getMessage(){
        if(type.compareTo("PickUp Location") == 0){
            return "%s not found".formatted(type);
        }
        else if(type.compareTo("Max Kms Limit") == 0){
            return "Reached %s".formatted(type);
        }
        return "Not found";
    }
}
