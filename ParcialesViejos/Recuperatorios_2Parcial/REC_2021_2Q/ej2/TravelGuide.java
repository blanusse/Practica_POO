package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_2Q.ej2;

import java.util.*;

public class TravelGuide {
    private Map<String, SortedMap<String, SortedSet<Landmark>>> map = new HashMap<>();



    public void addLandmark(String country, String city, Landmark landmark){
        map.putIfAbsent(country, new TreeMap<>());
        map.get(country).putIfAbsent(city, new TreeSet<>());
        map.get(country).get(city).add(landmark);
    }

    public int landmarksCount(String country, String city){
        if(!map.containsKey(country)){
            return 0;
        }
        return map.get(country).get(city).size();
    }

    public int landmarksCount(String country){
        if(!map.containsKey(country)){
            return 0;
        }
        int toReturn  = 0;
        for(String city : map.get(country).keySet()){
            toReturn += landmarksCount(country, city);
        }
        return toReturn;
    }

    public Collection<Landmark> getLandmarksFromCity(String country, String city){
        if(!map.containsKey(country) || !map.get(country).containsKey(city)){
            return new ArrayList<>();
        }

        return map.get(country).get(city);
    }

    public Collection<Landmark> getLandmarksFromCountry(String country){
        Collection<Landmark> toReturn = new ArrayList<>();
        if(map.containsKey(country)) {
            for (Set<Landmark> set : map.get(country).values()) {
                toReturn.addAll(set);
            }
        }
        return toReturn;
    }

    protected void checkBeforeMoving(String country, String oldCity, Landmark landmark){
        if(!map.containsKey(country)){
            throw new TravelGuideException("Country does not exists");
        }
        if(!map.get(country).containsKey(oldCity)){
            throw new TravelGuideException("Origin city does not exists in country");
        }
        if(!map.get(country).get(oldCity).contains(landmark)){
            throw new TravelGuideException("Landmark does not exists in origin city.\n");

        }
    }

    public void moveLandmark(String country, String oldCity, String newCity, Landmark landmark){
        checkBeforeMoving(country, oldCity, landmark);
        map.get(country).get(oldCity).remove(landmark);
        map.get(country).putIfAbsent(newCity, new TreeSet<>());
        map.get(country).get(newCity).add(landmark);
    }
}
