package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_1Q.ej3;

import java.util.*;
import java.util.function.Predicate;


public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements  SpecialCollection<T>{




    @Override
    public int count(Predicate<T> predicate) {
        int toReturn = 0;
        for(T element : this){
            if(predicate.test(element)){
                toReturn++;
            }
        }
        return toReturn;
    }

    @Override
    public int count(T elem1, T elem2, Predicate<T> predicate) {
        if(elem1.compareTo(elem2) > 0){
            return 0;
        }
        return count(new Predicate<>(){
            @Override
            public boolean test(T t) {
                return predicate.test(t) && elem1.compareTo(t) <= 0 && elem2.compareTo(t) >= 0;
            }
        });
    }
}
