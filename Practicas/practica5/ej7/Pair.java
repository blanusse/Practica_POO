package Practicas.practica5.ej7;

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
        int cmp = this.obj1.compareTo(o.obj1);
        if(cmp ==0){
            cmp = this.obj2.compareTo(o.obj2);
        }
        return cmp;
    }
}
