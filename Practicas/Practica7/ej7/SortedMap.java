package Practicas.Practica7.ej7;

import java.util.Map;

public interface SortedMap<K extends Comparable<? super K>,V> extends Map<K,V>, Iterable<Map.Entry<K,V>> {
    K firstKey();

    V firstValue();

}