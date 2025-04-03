package Practicas.practica4.ej7;

import java.util.Objects;

public class Interval {
    private double start, end, increment;
    String INTERVAL_SEPARATOR = "-";
    String INTERVAL_START = "[";
    String INTERVAL_END = "]";


    public Interval(double start, double end, double inc) {
        if(Double.compare(this.increment, inc) == 0){
            throw new IllegalArgumentException("Incremento debe ser distinto de cero");
        }
        this.end = end;
        this.start = start;
        this.increment = inc;
        if(size() == 0){
            throw new IllegalArgumentException("Intervalo vacio");
        }
    }

    public Interval(double start, double end){
        this(start, end, 1);
    }

    public long size(){
        return Math.max(0, (int) ((end - start) / increment) + 1);
    }
    public double at(long index){
        double toReturn = start +increment*index;
        if(index < 0){
            throw new IllegalArgumentException("Wrong index");
        }
        if((increment > 0 && start <= toReturn && end >= toReturn) ||(increment < 0 && start >= toReturn && end <= toReturn)){
            return toReturn;
        }
        throw new IllegalArgumentException("Wrong index");

    }
    public long indexOf(double valor){
        double nStart, nEnd, nInc;
        if(start < end){
            nStart = start;
            nEnd = end;
            nInc = increment;
        }
        else{
            nStart = end;
            nEnd = start;
            nInc = -increment;
        }

        for(double i=nStart; i< nEnd; i+=nInc){
            if(Double.compare(i, valor) == 0){
                return (long)(i-nStart +1);
            }
        }
        return 0;
    }
    public boolean includes(double valor){
        return indexOf(valor) != 0;
    }

    @Override
    public String toString(){
        return "%s%.2f%s%.2f%s".formatted(INTERVAL_START, start, INTERVAL_SEPARATOR, end, INTERVAL_END);
    }

    @Override
    public boolean equals(Object other){
        return (other instanceof Interval interv && Double.compare(this.start, interv.start) == 0
        && Double.compare(this.end, interv.end) == 0 && Double.compare(this.increment, interv.increment) == 0);
    }

    @Override
    public int hashCode(){
        return Objects.hash(start, end, increment);
    }
}
