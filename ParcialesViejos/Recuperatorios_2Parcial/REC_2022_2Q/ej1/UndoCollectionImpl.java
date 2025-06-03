package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_2Q.ej1;

import java.util.*;

public class UndoCollectionImpl<T> extends HashSet<T> implements UndoCollection<T>{
    private Deque<T> lastAddedSet = new LinkedList<>();

    @Override
    public boolean add(T element){
        lastAddedSet.push(element);
        return super.add(element);
    }

    public void undo(){
        if(this.isEmpty()){
            throw new NothingToUndoException("Nothing to undo");
        }
        this.remove(lastAddedSet.pop());
    }

    @Override
    public int undo(int n) {
        int i=0;
        for(; i<n && !this.isEmpty(); i++){
            this.remove(lastAddedSet.pop());
        }
        return i;
    }
}
