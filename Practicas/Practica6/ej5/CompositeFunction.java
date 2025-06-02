package Practicas.Practica6.ej5;

import java.util.ArrayList;
import java.util.List;

public class CompositeFunction implements Function {
    private final List<Function> list = new ArrayList<>();

    public void addFunction(Function fun){
        list.add(fun);
    }
    @Override
    public double evaluate(double x){
        if(list.isEmpty()){
            throw new IllegalStateException();
        }
        double toEv = x;
        for(Function function : list){
            toEv = function.evaluate(toEv);
        }
        return toEv;
    }

}
