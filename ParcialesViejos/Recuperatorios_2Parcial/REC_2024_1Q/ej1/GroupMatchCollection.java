package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_1Q.ej1;

import java.util.*;
import java.util.function.Predicate;

public interface GroupMatchCollection<T> extends SortedMap<Integer, T> {

    void add(T elem);

    boolean contains(T elem);

    TreeMap<Integer, Collection<T>> groupingByMatches();

    void addMatchPredicate(Predicate<T> predicate);
}
