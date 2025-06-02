package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_1Q.ej2;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.*;

public class EVCentral {
    private final Map<String, Double> clientMap = new HashMap<>();
    private final Map<String, Map<LocalDateTime, EVChargerType>> timeMap = new HashMap<>();







    public void register(String name) {
        clientMap.put(name, 0.0);
        timeMap.putIfAbsent(name, new TreeMap<>());
    }

    public double balance(String name) {
        return clientMap.get(name);
    }

    protected void checkClient(String name){
        if(!clientMap.containsKey(name)){
            throw new IllegalArgumentException("Client is not registered");
        }
    }

    protected void checkCharge(String name, LocalDateTime time, EVChargerType type){
        if(timeMap.get(name).containsKey(time)){
            throw new IllegalArgumentException("Charge already exists on client and datetime");
        }
    }


    public void charge(String name, LocalDateTime time, EVChargerType type, int hours) {
        checkClient(name);
        double newBalance = clientMap.get(name) + type.getCost(hours);
        clientMap.remove(name);
        clientMap.put(name, newBalance);
        checkCharge(name, time, type);
        timeMap.get(name).put(time, type);
    }

    public Set<LocalDateTime> getChargeDateTimes(String name){
        checkClient(name);
        return timeMap.get(name).keySet();
    }

    public Collection<EVChargerType> getChargerTypes(String name){
        checkClient(name);
        return timeMap.get(name).values();
    }
}
