package Practicas.practica5.ej5;


import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E>{
    private E[] elem;
    private int dim;
    private static final int INITIAL_DIM = 10;


    public ArrayStack(){
        elem = (E[])new Object[INITIAL_DIM];
        dim = 0;
    }

    @Override
    public void push(Object obj) {
        if(elem.length == dim){
            elem = Arrays.copyOf(elem, elem.length+INITIAL_DIM);
        }
        elem[dim] = (E)obj;
        dim++;
    }

    @Override
    public E peek() {
        return elem[dim-1];
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        E toRet = peek();
        dim--;
        return toRet;
    }

    @Override
    public String toString(){
        StringBuilder toRet = new StringBuilder("[");
        for(int i=dim-1;i>0; i--){
            toRet.append(elem[i]);
            toRet.append(", ");
        }
        toRet.append(elem[0]);
        toRet.append("]");
        return toRet.toString();
    }

    @Override
    public boolean isEmpty() {
        return dim==0;
    }


    protected int getDim(){
        return dim;
    }
}
