package Practicas.Practica7.ej7;

public class MyComparableClass implements Comparable<MyComparableClass>{
    private final String obj;
    public String sortableIdentifier;


    public MyComparableClass(String s) {
        this.obj = s;
    }


    public String getObj() {
        return obj;
    }

    public String getSortableId() {
        return sortableIdentifier;
    }

    @Override
    public int compareTo(MyComparableClass o) {
        return this.sortableIdentifier.compareTo(o.sortableIdentifier);
    }

    public String toString(){
        return "%s - (%s)".formatted(obj, sortableIdentifier);
    }
}
