package Taller.Taller4.ej1;

public interface List<T> {


    void add(T toAdd);
    int contains(T elem);
    default boolean removeElement(T elem){
        int index = contains(elem);
        if(index != -1){
            return remove(index);
        }
        return false;
    }
    boolean remove(int idx);
    boolean isEmpty();

}
