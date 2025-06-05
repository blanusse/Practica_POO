package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej1;

import java.util.*;
import java.util.function.Predicate;

public class MysteryCollectionImpl<T extends Comparable<? super T>>  extends ArrayList<T> implements  MysteryCollection<T>{


    @Override
    public SortedMap<T, Integer> toSortedBag() {
        return toSortedBag(new Predicate<T>(){
            @Override
            public boolean test(T element){
                return true;
            }
        });
    }

    @Override
    public SortedMap<T, Integer> toSortedBag(Predicate<T> predicate) {
        SortedMap<T, Integer> toReturn = new TreeMap<>();
        for(T element : this){
            if(predicate.test(element)){
                toReturn.put(element, toReturn.getOrDefault(element, 0)+1);
            }
        }
        return toReturn;
    }
}
