package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_2C.ej3;


import java.util.*;
import java.util.function.BinaryOperator;

public class MysteryCollection<T extends Comparable<? super T>> extends TreeSet<T> implements Set<T>{



    protected T join(Set<T> set, T base, BinaryOperator<T> operator){
        T toReturn = base;
            for(T element : set){
                toReturn = operator.apply(toReturn, element);
            }
        return toReturn;
    }

    public T reduce(T base, BinaryOperator<T> operator){
        return join(this, base, operator);
    }

    public T reduceInverse(T base, BinaryOperator<T> operator){
        Set<T> help = new TreeSet<>(Comparator.reverseOrder());
        help.addAll(this);
        return join(help, base, operator);
    }

}