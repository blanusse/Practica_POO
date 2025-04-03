package Taller.Taller4.ej2;

import Taller.Taller4.ej1.List;

import java.util.Arrays;

public class ArrayIntegerList implements List<Integer> {
    private Integer[] list;
    private int size;
    public static final int DIM = 10;

    public ArrayIntegerList(){
        this.size = 0;
        list = new Integer[DIM];
    }

    @Override
    public void add(Integer toAdd) {
        if(size == list.length){
            this.list = Arrays.copyOf(list, list.length+DIM);
        }
        this.list[size++] = toAdd;
    }

    @Override
    public int contains(Integer elem) {
        for(int i=0; i<size; i++){
            if(list[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean remove(int idx) {
        if (idx < size) {
            list[idx] = 0;
            size--;
            return true;

        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}

