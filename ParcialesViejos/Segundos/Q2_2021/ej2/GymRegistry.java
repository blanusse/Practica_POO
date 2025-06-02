package ParcialesViejos.Segundos.Q2_2021.ej2;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class GymRegistry{
    private final Map<String, Map<Integer, Integer>> map = new HashMap<>();
    private final Map<String, Membership> map2 = new HashMap<>();


    protected void existingClient(String name){
        if(map2.containsKey(name)){
            throw new GymRegistryException("%s already exists".formatted(name));
        }
    }


    public void registerClient(String name, Membership member){
        existingClient(name);
        map.put(name, new HashMap<>());
        map2.put(name, member);
    }

    public void canCheckClient(String name){
        if(!map2.containsKey(name)){
            throw new GymRegistryException("%s is not registered".formatted(name));
        }
    }

    public int visitsCount(String name, int month){
        canCheckClient(name);
        return map.get(name).getOrDefault(month, 0);
    }

    public int visitsCount(String name){
        canCheckClient(name);
        int toReturn = 0;
        for(int visits : map.get(name).values()){
            toReturn += visits;
        }
        return toReturn;
    }

    public GymRegistry visit(String name, int month){
        if(!canVisit(name, month)){
            throw new GymRegistryException("Max visits per month already reached for %s".formatted(name));
        }
        map.get(name).putIfAbsent(month, 0);
        int actualVisits = map.get(name).get(month);
        map.get(name).put(month,actualVisits+1);
        return this;
    }

    public boolean canVisit(String name, int month){
        canCheckClient(name);
        if(map2.get(name).equals(Membership.PRO)){
            return true;
        }
        int maxVisits = map2.get(name).getMaxVisits();
        int actualVisits  = map.get(name).getOrDefault(month, 0);
        return actualVisits < maxVisits;
    }
}
