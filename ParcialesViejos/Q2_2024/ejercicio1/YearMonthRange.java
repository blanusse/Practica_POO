package ParcialesViejos.Q2_2024.ejercicio1;


import java.time.Year;
import java.time.YearMonth;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class YearMonthRange implements Iterable<YearMonth>{
    private YearMonth start;
    private YearMonth end;
    private UnaryOperator<YearMonth> operator;




    public YearMonthRange(YearMonth start, YearMonth end, UnaryOperator<YearMonth> operator){
        this.start = start;
        this.end = end;
        this.operator = operator;
    }

    public YearMonthRange(YearMonth start, YearMonth end){
        this(start, end, YearMonth->YearMonth.plusMonths(1));
    }

    @Override
    public Iterator<YearMonth> iterator() {
        return new Iterator<>() {
            YearMonth current = start;

            @Override
            public boolean hasNext() {
                return (end.isAfter(current) || end.equals(current));
            }

            @Override
            public YearMonth next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                YearMonth toRet = current;
                current = operator.apply(current);
                return toRet;
            }
        };
    }
}
