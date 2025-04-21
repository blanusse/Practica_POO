package Practicas.practica5.ej6;


public class ArrayAccessStack<E> extends ArrayStack<E> implements AccessStack<E>{
    private int popCount;

    public ArrayAccessStack(){
        super();
        popCount = 0;
    }

    @Override
    public E pop(){
        E toRet = super.pop();
        popCount++;
        return toRet;
    }

    @Override
    public int getPopAccesses() {
        return popCount;
    }

    @Override
    public int getPushAccesses() {
        return getDim() + getPopAccesses();
    }
}
