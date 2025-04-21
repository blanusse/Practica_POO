package Practicas.practica5.ej1;

public class Pair<T, E> {
    private T obj1;
    private E obj2;

    public Pair(T left, E right){
        this.obj1 = left;
        this.obj2 = right;
    }


//    public void setObj(T obj1){
//        this.obj1 = obj1;
//    }
//    public void setObj(E obj2){
//        this.obj2 = obj2;
//    }

    //LA SOLUCION ES:
//    public void setObj1(T obj1){
//        this.obj1 = obj1;
//    }
//    public void setObj2(E obj2){
//        this.obj2 = obj2;
//    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Pair<?, ?> other && obj1.equals(other.obj1) && obj2.equals(other.obj2);
    }

    @Override
    public String toString(){
        return "[%s, %s]".formatted(obj1, obj2);
    }
}
