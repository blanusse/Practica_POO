package ParcialesViejos.Segundos.Q2_2024.ej2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BinaryOperator;

public class FlipMap<K extends Comparable<? super K>, V> extends TreeMap<K, V> {

    public Map<V, K> flip(K s, BinaryOperator<K> operator){
        return flip(entrySet(), s, operator);
    }


    public Map<V, K> flipInverse(K s, BinaryOperator<K> operator){
        return flip(reversed().entrySet(), s, operator);

    }

    private Map<V, K> flip(Set<Map.Entry<K, V>> set, K s, BinaryOperator<K> operator){
        Map<V, K> toReturn = new HashMap<>();
        for(Map.Entry<K, V> entry : set){
            K flip = toReturn.getOrDefault(entry.getValue(), s);
            toReturn.put(entry.getValue(), operator.apply(flip, entry.getKey()));
        }
        return toReturn;
    }
}
