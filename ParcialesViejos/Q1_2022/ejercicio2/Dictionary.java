package ParcialesViejos.Q1_2022.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Dictionary<T extends Comparable<? super T>>{
    private DictionaryEntry<T>[] colection;
    private int size;
    private final static int INITIAL_DIM = 10;

    @SuppressWarnings("unchecked")
    public Dictionary(){
        colection = new DictionaryEntry[INITIAL_DIM];
        size = 0;
    }

    private void resize(){
        if(size % INITIAL_DIM ==0){
            colection = Arrays.copyOf(colection, size+INITIAL_DIM);
        }
    }

    public Dictionary<T> addEntry(T object, String definition){
        resize();
        colection[size++] = new DictionaryEntry<>(definition, object);
        return this;
    }

    public DictionaryEntry<T>[] getNaturalOrderCopy(){
        return orderCopy(Comparator.naturalOrder());
    }

    public DictionaryEntry<T>[] getReverseOrderCopy(){
        return orderCopy(Comparator.reverseOrder());
    }

    private DictionaryEntry<T>[] orderCopy(Comparator<DictionaryEntry<T>> comp){
        DictionaryEntry<T>[] toReturn = Arrays.copyOf(colection, size);
        Arrays.sort(toReturn, comp);
        return toReturn;

    }

    public DictionaryEntry<T> getFirstMatch(Predicate<T> pred){
        for(int i=0; i<size; i++){
            if(pred.test(colection[i].getObject())){
                return colection[i];
            }
        }
        throw new IllegalArgumentException();
    }



}
