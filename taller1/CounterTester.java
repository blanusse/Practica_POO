package taller1;

public class CounterTester {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        count1.increment();
        System.out.println(count1.getCount());
        count1.increment();
        count1.increment();
        count1.increment();
        System.out.println(count1.getCount());
        Counter count2 = new Counter();
        count2.decrement();
        count2.decrement();
        count2.decrement();
        System.out.println(count2.getCount());

    }
}
