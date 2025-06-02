package ParcialesViejos.Segundos.Q1_2024.ej1;

import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;
import java.util.function.Predicate;

public interface MatchCollection<T extends Comparable<? super T>> extends List<T> {

    public Iterable<T> getAllMatched();
    public Iterable<T> getAllMatchedReversed();
    public void addMatchPredicate(Predicate<T> predicate);
}
