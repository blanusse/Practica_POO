package ParcialesViejos.Q2_2023.ejericio2;

public class LoungeException extends Exception{
    private String message;

    public LoungeException(String message){
        this.message = message;
    }

    public String getMessage() {
        if(message.equals("exit")){
            return "Lounge is empty";
        }
        if (message.equals("closed")){
            return "Cannot enter lounge";
        }
        return null;
    }
}
