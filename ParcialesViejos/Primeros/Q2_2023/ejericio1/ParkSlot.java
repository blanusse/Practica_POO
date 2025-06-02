package ParcialesViejos.Primeros.Q2_2023.ejericio1;

import java.time.LocalTime;

public class ParkSlot {
    private String atractionName;
    private LocalTime intervalStart;


    public ParkSlot(String atractionName, LocalTime intervalStart){
        this.atractionName = atractionName;
        this.intervalStart = intervalStart;
    }

    @Override
    public String toString(){
        return "%s <> %s slot".formatted(atractionName, intervalStart);
    }
}
