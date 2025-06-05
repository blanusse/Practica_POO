package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_2C.ej2;


import java.util.*;

public class StockManager{
    private final Map<String, Map<String, Integer>> productMap = new HashMap<>();
    private final SortedMap<String, Integer> stockMap = new TreeMap<>();

    public boolean add(String product, int amount){
        if(stockMap.containsKey(product)){
            return false;
        }
        stockMap.put(product, amount);
        productMap.put(product, new TreeMap<>(Comparator.reverseOrder()));
        return true;
    }

    public Collection<String> products(){
        return stockMap.keySet();
    }


    public Collection<String> salesClients(String product){
        return productMap.get(product).keySet();
    }

    public int stockUnits(String product){
        return stockMap.getOrDefault(product, 0);
    }

    public int salesUnits(String product, String client){
        return productMap.getOrDefault(product, new HashMap<>()).getOrDefault(client, 0);
    }

    public boolean purchase(String product, String client, int amount){
        if(!stockMap.containsKey(product) || stockMap.get(product) < amount){
            return false;
        }
        int newStockAmount = stockMap.get(product) - amount;
        stockMap.put(product, newStockAmount);
        int newClientAmount = productMap.get(product).getOrDefault(client, 0) + amount;
        productMap.get(product).put(client, newClientAmount);
        return true;
    }







}