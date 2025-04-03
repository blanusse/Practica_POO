package Taller.Taller1;

public class MultipleCounter extends Counter{
    private int times;
    public MultipleCounter(int n){
        super();
        this.times = n;
    }
    @Override

    public void increment(){
        int aux = times;
        while(aux > 0){
            super.increment();
            aux--;
        }
    }

    @Override
    public void decrement(){
        int aux = times;
        while(aux > 0){
            super.decrement();
            aux--;
        }
    }

    public int getCount(){
        return super.getCount();
    }
}
