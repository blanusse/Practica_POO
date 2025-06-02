package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_2Q.ej1;

import java.time.LocalDate;

public class Event implements Comparable<Event>{
    private final String name;
    private final EventType type;
    private final LocalDate date;
    private final String user;

    public Event(String name, EventType type, LocalDate date, String user) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.user = user;
    }

    public String toString(){
        return "%s on file %s of user %s on %s".formatted(type, name, user, date);
    }

    @Override
    public int compareTo(Event other){
        int cmp = this.date.compareTo(other.date);
        if(cmp == 0){
            cmp = this.type.compareTo(other.type);
        }
        return cmp;
    }

}
