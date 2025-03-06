package taller1;

public class MultipleCounter extends Counter{
    private int counter;
    private int parameter;
    public MultipleCounter(int n){
        counter = 0;
        parameter = n;
    }
    public void increment(){
        counter += parameter;
    }
    public void decrement(int n){
        counter -= parameter;
    }
    public int getCount(){
        return counter;
    }
}
