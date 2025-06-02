package ParcialesViejos.Primeros.Q1_2024.ejercicio3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AirPort{
    private Counter[] colection;
    private int size;
    private final static int INITIAL_DIM = 10;

    public AirPort(){
        colection = new Counter[INITIAL_DIM];
        size = 0;
    }

    public Counter addCounter(String company){
        if(colection.length % INITIAL_DIM == 0){
            colection = Arrays.copyOf(colection, size+INITIAL_DIM);
        }
        Counter toReturn = new Counter(company, size);
        colection[size++] = toReturn;
        return toReturn;
    }
    public Counter[] airlineOrderCounters(){
        return orderCopy(Comparator.naturalOrder());
    }

    public Counter[] airlineDescendingOrderCounters(){
        return orderCopy(Comparator.reverseOrder());
    }

    private Counter[] orderCopy(Comparator<Counter> comparator) {
        Counter[] aux = Arrays.copyOf(colection, size);
        Arrays.sort(aux, comparator);
        return aux;
    }

    public void counterCheckIn(Predicate<Counter> evaluator){
        for(int i=0; i<size; i++){
            if(evaluator.test(colection[i])){
                colection[i].checkIn();
            }
        }
    }

}
