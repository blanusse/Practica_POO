package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_1Q.ej1;

import java.util.*;
import java.util.function.Predicate;

public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements SpecialCollection<T>{
    private Deque<T> lastDeleted = new LinkedList<>();

    public SpecialCollectionImpl() {
        super(Comparator.reverseOrder());
    }


    @Override
    public void deleteFirst() {
        deleteFirst(new Predicate<T>(){
            @Override
            public boolean test(T elem){
                return true;
            }
        });
    }

    @Override
    public void deleteFirst(Predicate<T> predicate) {
        T firstElem = this.getFirst();
        if(predicate.test(firstElem)){
            lastDeleted.push(firstElem);
            this.remove(firstElem);
        }
    }

    @Override
    public void undoDeleteFirst() {
        if(this.lastDeleted.isEmpty()){
            throw new NothingToUndoException("Nothing to undo");
        }
        this.add(lastDeleted.pop());
    }
}
