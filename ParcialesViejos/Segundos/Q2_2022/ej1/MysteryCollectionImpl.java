package ParcialesViejos.Segundos.Q2_2022.ej1;

import java.util.*;

public class MysteryCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements MysteryCollection<T>{

    public MysteryCollectionImpl() {
        super(Comparator.reverseOrder());
    }

    @Override
    public <E extends Comparable<? super E>> Collection<Pair<T, E>> zip(MysteryCollection<E> other){
        Iterator<T> itT = this.iterator();
        Iterator<E> itE = other.iterator();
        Set<Pair<T, E>> toReturn = new HashSet<>();
        while (itT.hasNext() && itE.hasNext()){
            toReturn.add(new Pair<>(itT.next(), itE.next()));
        }
        return toReturn;
    }
}
