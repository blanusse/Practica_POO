package ParcialesViejos.Primeros.Q1_2023.ejercicio1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class CustomIndex<T> implements Iterable<T>{
    private T[] colection;
    private UnaryOperator<Integer> operator;
    private int idxFirstElem, idxLastElem;


    private boolean checkInput(int idxFirstElem, int idxLastElem){
        return (idxLastElem > 0 && idxFirstElem <= idxLastElem);
    }


    public CustomIndex(T[] array, int idxFirstElem, int idxLastElem, UnaryOperator<Integer> operator){
        if(!checkInput(idxFirstElem, idxLastElem)){
            throw new RuntimeException("Invalid combination of start and end");
        }
        this.colection = array;
        this.idxFirstElem = idxFirstElem;
        this.idxLastElem = idxLastElem;
        setNextIndex(operator);
    }

    public void setNextIndex(UnaryOperator<Integer> operator){
        this.operator = operator;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            int currentIdx = idxFirstElem;
            int lastIdx = idxLastElem;
            UnaryOperator<Integer> op = operator;

            @Override
            public boolean hasNext() {
                return currentIdx <= lastIdx;
            }

            @Override
            public T next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                T toReturn = colection[currentIdx];
                currentIdx = op.apply(currentIdx);
                return toReturn;
            }
        };
    }
}
