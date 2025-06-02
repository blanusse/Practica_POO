//package Taller.Taller4.ej3;
//
//import java.util.Arrays;
//import Taller.Taller4.ej1.List;
//
//public class ArrayList<T> implements List<T>{
//    private T[] list;
//    private int size;
//    public static final int DIM = 10;
//
//    public ArrayList(){
//        this.size = 0;
//        list = (T[]) new Object[DIM];
//    }
//
//    public void add(T toAdd) {
//        if(size == list.length){
//            this.list = Arrays.copyOf(list, list.length + DIM);
//        }
//        this.list[size++] = toAdd;
//    }
//
//    public int contains(T elem) {
//        for(int i=0; i<size; i++){
//            if(list[i].equals(elem)){
//                return i;
//            }
//        }
//        return -1;
//    }
//
////    public boolean removeElement(Integer elem);
//
//    public boolean remove(int idx) {
//        if (idx < size) {
//            list[idx] = null;
//            size--;
//            return true;
//
//        }
//        return false;
//    }
//
//    public boolean isEmpty() {
//        return size==0;
//    }
//}
