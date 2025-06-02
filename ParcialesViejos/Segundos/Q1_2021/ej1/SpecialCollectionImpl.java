package ParcialesViejos.Segundos.Q1_2021.ej1;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements SpecialCollection<T>{
    private T latestDeleted;

    public SpecialCollectionImpl() {
        super(Comparator.reverseOrder());
        this.latestDeleted = null;
    }

    @Override
    public void deleteFirst() {
        deleteFirst(new Predicate<T>(){
            @Override
            public boolean test(T o){
                return true;
            }
        });
    }

    @Override
    public void deleteFirst(Predicate<T> predicate) {
        if(this.isEmpty()){
            throw new NoSuchElementException("Nothing to delete");
        }
        for(T elem : this){
            if(predicate.test(elem)){
                this.latestDeleted = this.getFirst();
                this.remove(latestDeleted);
                return;
            }
        }
    }

    @Override
    public void undoDeleteFirst() {
        if(latestDeleted == null){
            throw new NothingToUndoException("Nothing to undo");
        }
        this.add(latestDeleted);
        latestDeleted = null;
    }
}
