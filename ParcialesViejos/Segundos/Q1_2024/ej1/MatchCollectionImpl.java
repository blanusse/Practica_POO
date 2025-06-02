package ParcialesViejos.Segundos.Q1_2024.ej1;


import java.util.*;
import java.util.function.Predicate;

public class MatchCollectionImpl<T extends Comparable<? super T>> extends ArrayList<T> implements MatchCollection<T> {
    private List<Predicate<T>> predicates = new ArrayList<>();


    protected Iterable<T> order(Comparator<T> comparator){
        SortedSet<T> toReturn = new TreeSet<>(comparator);
        toReturn.addAll(this);
        for (T elem : this){
            for(Predicate<T> pred : predicates){
                if(!pred.test(elem)){
                    toReturn.remove(elem);
                }
            }
        }
        return toReturn;

    }

    @Override
    public Iterable<T> getAllMatched() {
        return order(Comparator.naturalOrder());
    }

    @Override
    public Iterable<T> getAllMatchedReversed() {
        return order(Comparator.reverseOrder());
    }

    @Override
    public void addMatchPredicate(Predicate<T> predicate) {
        predicates.add(predicate);
    }
}
