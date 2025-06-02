package Practicas.Practica7.ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T> {

    public List<T> filter(Predicate<T> criteria){
        List<T> toReturn = new ArrayFilterList<>();
        for(T elem :this){
            if(criteria.test(elem)){
                toReturn.add(elem);
            }
        }
        return toReturn;
    }

}
