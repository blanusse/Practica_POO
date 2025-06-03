package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_2Q.ej1;

import java.time.LocalDate;
import java.util.*;


public class GDrive {
    private final Map<String, SortedSet<Event>> eventByArea = new HashMap<>() ;
    private final Map<String, String> areaByFile = new HashMap<>();

    protected void existingFile(String docName){
        if(areaByFile.containsKey(docName)){
            throw new RuntimeException("File already exists");
        }

    }

    public void addFileToWorkArea(String docName, String area){
        existingFile(docName);
        areaByFile.put(docName, area);
    }

    public void logEvent(String docName, String user, LocalDate date, EventType type){
        eventByArea.putIfAbsent(areaByFile.get(docName), new TreeSet<>());
        eventByArea.get(areaByFile.get(docName)).add(new Event(docName, type, date, user));
    }

    protected void checkArea(String area){
        if(!eventByArea.containsKey(area)){
            throw new IllegalArgumentException();
        }
    }

    public Collection<Event> events(String area){
        return eventByArea.getOrDefault(area, new TreeSet<>());
    }

    public Event earliestEvent(String area){
        checkArea(area);
        return eventByArea.get(area).getFirst();
    }

    public Event mostRecentEvent(String area){
        checkArea(area);
        return eventByArea.get(area).getLast();


    }
}
