package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_1Q.ej1;

import java.util.Collection;
import java.util.Set;
import java.util.*;
import java.util.TreeMap;
import java.util.function.Predicate;

public class GroupMatchCollectionImpl<T> extends TreeMap<Integer, T> implements GroupMatchCollection<T> {
    private Collection<Predicate<T>> predicates = new ArrayList<>();

    @Override
    public void add(T elem) {
        this.put(this.size(), elem);
    }

    @Override
    public boolean contains(T elem) {
        for(T element : this.values()){
            if(element.equals(elem)){
                return true;
            }
        }
        return false;
    }

    @Override
    public TreeMap<Integer, Collection<T>> groupingByMatches() {
        TreeMap<Integer, Collection<T>> toReturn = new TreeMap<>();
        for(T element : this.values()){
            int amount = 0;
            for(Predicate<T> predicate : predicates){
                if(predicate.test(element)){
                    amount++;
                }
            }
            toReturn.putIfAbsent(amount, new ArrayList<>());
            toReturn.get(amount).add(element);
        }
        return toReturn;
    }

    @Override
    public void addMatchPredicate(Predicate<T> predicate) {
        predicates.add(predicate);
    }
}
