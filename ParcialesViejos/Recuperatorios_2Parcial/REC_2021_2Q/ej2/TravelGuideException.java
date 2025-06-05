package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_2Q.ej2;

public class TravelGuideException extends RuntimeException{
    private String message;
    public TravelGuideException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
