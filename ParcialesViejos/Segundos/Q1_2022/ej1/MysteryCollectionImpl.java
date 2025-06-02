package ParcialesViejos.Segundos.Q1_2022.ej1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

public class MysteryCollectionImpl<T> extends HashMap<Integer, T> implements MysteryCollection<T> {


    @Override
    public boolean contains(T element) {
        return this.containsValue(element);
    }

    @Override
    public void add(T element) {
        this.put(this.size(), element);
    }

    @Override
    public Map<T, Integer> toBag() {
        return toBag(new Predicate<T>() {
            @Override
            public boolean test(T t) {
                return true;
            }
        });
    }

    @Override
    public Map<T, Integer> toBag(Predicate<T> predicate) {
        Map<T, Integer> toReturn = new HashMap<>();
        for(T elem : this.values()){
            if(predicate.test(elem) && !toReturn.containsKey(elem)) {
                toReturn.put(elem, 0);
                for (T elem2 : this.values()) {
                    if (elem.equals(elem2)) {
                        toReturn.put(elem, toReturn.get(elem) + 1);
                    }
                }
            }
        }
        return toReturn;
    }
}
