package Practicas.Practica7.ej5;

import Practicas.Practica6.ej8.Bag;

import java.util.HashMap;
import java.util.Map;

public class BagImpl<T> implements Bag<T> {

    protected Map<T, Integer> bag = new HashMap<>();


    @Override
    public void add(T element) {
        if(bag.containsKey(element)){
            bag.put(element, bag.get(element)+1);
        }
        else{
            bag.put(element, 1);
        }
    }

    @Override
    public int size() {
        int toReturn = 0;
        for(Integer i : bag.values()){
            toReturn+= i;
        }
        return toReturn;
    }

    @Override
    public boolean contains(T element) {
        return bag.containsKey(element);
    }

    @Override
    public void remove(T element) {
        if(bag.get(element) > 1){
            bag.put(element, bag.get(element)-1);
        }
        else{
            bag.remove(element);
        }
    }

    @Override
    public int sizeDistinct() {
        return bag.size();
    }

    @Override
    public int count(T element) {
        return bag.get(element);
    }


//    private final Collection<T> bag  = new ArrayList<>();
//
//
//    @Override
//    public void add(T element) {
//        bag.add(element);
//    }
//
//    @Override
//    public int size() {
//        return bag.size();
//    }
//
//    @Override
//    public boolean contains(T element) {
//        return bag.contains(element);
//    }
//
//    @Override
//    public void remove(T element) {
//        if(!bag.contains(element)){
//            throw new NoSuchElementException();
//        }
//        bag.remove(element);
//    }
//
//    @Override
//    public int sizeDistinct() {
//        Set<T> set = new HashSet<>(bag);
//        return set.size();
//    }
//
//    @Override
//    public int count(T element) {
//        int toReturn = 0;
//        for(T elem : bag){
//            if(elem.equals(element)){
//                toReturn++;
//            }
//        }
//        return toReturn;
//    }
}
