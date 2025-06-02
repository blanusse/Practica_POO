package ParcialesViejos.Segundos.Q2_2023.ej1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class RouteCentral {
    private final UnaryOperator<Integer> operator;
    private final Map<String, Map<String, Integer>> central = new HashMap<>();


    public RouteCentral(UnaryOperator<Integer> operator) {
        this.operator = operator;
    }

    public void addOneWayRoute(String from, String to, int miles){
        central.putIfAbsent(from, new HashMap<>());
        central.get(from).putIfAbsent(to, miles);
    }

    public void addTwoWayRoute(String from, String to, int miles){
        central.putIfAbsent(from, new HashMap<>());
        central.putIfAbsent(to, new HashMap<>());
        central.get(from).putIfAbsent(to, operator.apply(miles));
        central.get(to).putIfAbsent(from, operator.apply(miles));

    }

    protected void checkRoute(String from, String to){
        if(!central.containsKey(from) || !central.get(from).containsKey(to)){
            throw new RuntimeException("Route does not exists");
        }
    }

    public int getDirectRouteMiles(String from, String to){
        checkRoute(from, to);
        return central.get(from).get(to);
    }

    public int getOneStopRouteMiles(String from, String scale, String to){
        checkRoute(from, scale);
        checkRoute(scale, to);
        return central.get(from).get(scale) + central.get(scale).get(to);
    }

    public void changeRouteCost(String from, String to, int newMiles){
        checkRoute(from, to);
        central.get(from).remove(to);
        central.get(from).put(to, newMiles);
    }



}
