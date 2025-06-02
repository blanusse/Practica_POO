package ParcialesViejos.Segundos.Q1_2024.ej2;

import java.time.YearMonth;
import java.util.*;

public class ReimbursementTracker {
    private final Map<String, Integer> clientMax = new HashMap<>();
    private final Map<String, SortedMap<YearMonth, Integer>> tracker = new HashMap<>();

    public void registerClient(String name, int maxAmount){
        if(clientExists(name)){
            throw new RuntimeException("Client already registered");
        }
        tracker.put(name, new TreeMap<>());
        clientMax.put(name, maxAmount);
    }

    protected boolean clientExists(String name){
        return tracker.containsKey(name);
    }

    public int getRemainingReimbursement(String name, YearMonth date){
        if(!clientExists(name)){
            throw new RuntimeException("Client is not registered");
        }
        return clientMax.get(name) - tracker.get(name).getOrDefault(date, 0);
    }

    protected boolean canAddRefund(String name, YearMonth date, int amount){
        return clientMax.get(name) >= amount + tracker.get(name).getOrDefault(date, 0);
    }

    public void addReimbursement(String name, YearMonth date, int amount){
        if(!clientExists(name)){
            throw new RuntimeException("Client is not registered");
        }
        if (!canAddRefund(name, date, amount)){
            throw new RuntimeException("Reimbursement surpasses month cap.");
        }
        int currentValue = tracker.get(name).getOrDefault(date, 0);
        tracker.get(name).put(date, amount+currentValue);
    }

    public Set<Map.Entry<YearMonth, Integer>> getReimbursements(String name, YearMonth from, YearMonth until){
        if(!clientExists(name)){
            throw new RuntimeException("Client is not registered");
        }
        return tracker.getOrDefault(name, new TreeMap<>()).subMap(from, until).entrySet();


    }



}
