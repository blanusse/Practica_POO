package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_1Q.ej3;

import java.util.*;
import java.util.function.Predicate;

public interface SpecialCollection<T extends Comparable<? super T>> extends SortedSet<T> {


    int count(Predicate<T> predicate);
    int count(T elem1, T elem2, Predicate<T> predicate);
}
