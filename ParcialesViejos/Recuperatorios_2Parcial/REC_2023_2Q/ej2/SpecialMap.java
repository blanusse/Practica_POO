package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_2Q.ej2;

import java.util.*;

public class SpecialMap<T, E extends Comparable<? super E>> extends HashMap<T, E> {



    protected SortedMap<E, Collection<T>> group(Comparator<E> comparator){
        SortedMap<E, Collection<T>> toReturn = new TreeMap<>(comparator);
        for(Map.Entry<T, E> entry : this.entrySet()){
            toReturn.putIfAbsent(entry.getValue(), new ArrayList<>());
            toReturn.get(entry.getValue()).add(entry.getKey());
        }
        return toReturn;
    }

    public SortedMap<E, Collection<T>> groupByValue(){
        return group(Comparator.naturalOrder());
    }

    public SortedMap<E, Collection<T>>  groupByValueReversed(){
        return group(Comparator.reverseOrder());

    }
}
