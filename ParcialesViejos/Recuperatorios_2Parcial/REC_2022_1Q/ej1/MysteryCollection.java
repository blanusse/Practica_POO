package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej1;

import java.util.*;
import java.util.function.Predicate;

public interface MysteryCollection<T extends Comparable<? super T>> extends List<T> {

    SortedMap<T, Integer> toSortedBag();
    SortedMap<T, Integer> toSortedBag(Predicate<T> predicate);
}
