package ParcialesViejos.Segundos.Q2_2022.ej1;

import java.util.Collection;
import java.util.SequencedCollection;
import java.util.SortedSet;

public interface MysteryCollection<T> extends SequencedCollection<T> {

    <E extends Comparable<? super E>> Collection<Pair<T, E>> zip(MysteryCollection<E> other);
}
