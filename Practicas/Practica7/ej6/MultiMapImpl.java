package Practicas.Practica7.ej6;

import java.util.*;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V> {

    private Map<K, Set<V>> multiMap = new HashMap<>();

    //*/
    //* Agrega un par key,value al multimapa si el par no existe.
    @Override
    public void put(K key, V value) {
        if(!multiMap.containsKey(key)){
            multiMap.put(key, new TreeSet<>(Comparator.reverseOrder()));
        }
        multiMap.get(key).add(value);
    }

    //*/
    @Override
    public int size() {
        int toReturn = 0;
        for(Set<V> set : multiMap.values()){
            toReturn+= set.size();
        }
        return toReturn;
    }

    //*/
            //* Cantidad de valores del multimapa para la clave key.
    @Override
    public int size(K key) {
        return multiMap.get(key).size();
    }

    //*/
                //* Elimina la clave del multimapa (con todos sus valores) si existe.
    @Override
    public void remove(K key) {
        multiMap.remove(key);
    }

    //*/
                    //* Elimina el valor value de la clave key si existe.
    @Override
    public void remove(K key, V value) {
        multiMap.get(key).remove(value);
    }

    //*/
                        //* Colección ordenada descendentemente de valores de clave key.
    @Override
    public Iterable<V> get(K key) {
        if(!multiMap.containsKey(key)){
            return null;
        }
        return new Iterable<V>() {
            @Override
            public Iterator<V> iterator() {
                return multiMap.get(key).iterator();
            }
        };
    }
}
