package ParcialesViejos.Q1_2022.ejercicio2;

import java.util.Comparator;

public class DictionaryEntry<T extends Comparable<? super T>> implements Comparable<DictionaryEntry<T>> {
    private final T object;
    private final String definition;


    public DictionaryEntry(String definition, T object) {
        this.definition = definition;
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public String getDefinition() {
        return definition;
    }


    @Override
    public int compareTo(DictionaryEntry<T> o) {
        int cmp = this.object.compareTo(o.object);
        if(cmp == 0){
            cmp = this.definition.compareTo(o.definition);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "%s <> %s".formatted(object, definition);
}
}
