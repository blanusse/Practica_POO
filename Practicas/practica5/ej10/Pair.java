package Practicas.practica5.ej10;

public class Pair<A extends Comparable<? super A>, B extends Comparable<? super B>> implements Comparable<Pair<A,B>>{
    private final A obj1;
    private final B obj2;

    public Pair(A left, B right){
        this.obj1 = left;
        this.obj2 = right;
    }




    @Override
    public boolean equals(Object o) {
        return o instanceof Pair<?, ?> other && obj1.equals(other.obj1) && obj2.equals(other.obj2);
    }

    @Override
    public String toString(){
        return "[%s, %s]".formatted(obj1, obj2);
    }


    @Override
    public int compareTo(Pair<A, B> o) {
        int cmp = o.obj1.compareTo(this.obj1);
        if(cmp ==0){
            cmp = o.obj2.compareTo(this.obj2);
        }
        return cmp;
    }
}
