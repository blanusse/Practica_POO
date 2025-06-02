package ParcialesViejos.Primeros.Q2_2023.ejericio3;

import java.util.Arrays;
import java.util.Comparator;

public class MinToMaxReport<R> implements ReportCollection<R>{
    private R[] colection;
    private int size;
    private final static int INITIAL_DIM = 10;
    private Comparator<? super R> cmp;

    public MinToMaxReport(Comparator<? super R> cmp){
        colection = (R[])new Object[INITIAL_DIM];
        this.size = 0;
        this.cmp = cmp;
    }

    @Override
    public void add(R report) {
        if(size % INITIAL_DIM == 0){
            colection = Arrays.copyOf(colection, size + INITIAL_DIM);
        }
        colection[size++] = report;
    }

    @Override
    public R get(int index) {
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Error");
        }
        return colection[index];
    }

    @Override
    public R[] reports() {
        R[] toReturn = Arrays.copyOf(colection, size);
        Arrays.sort(toReturn, cmp);
        return toReturn;
    }
}
