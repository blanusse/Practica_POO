package Practicas.Practica6.ej7;

import java.util.Collection;

public class ej7<T extends Comparable<? super T>> {

    public T mayor(Collection<T> collection){
        if(collection.isEmpty()){
            return null;
        }
        T toReturn = null;
        for(T element : collection){
            if(toReturn == null || element.compareTo(toReturn) > 0){
                toReturn = element;
            }
        }
        return toReturn;
    }
}
