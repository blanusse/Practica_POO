package ParcialesViejos.Q1_2022.ejercicio1;

import java.util.Iterator;

public class MilesClient implements Iterable<String>{
    private Plan plantype;
    private String name;
    private int monthSubscription;


    public MilesClient(String name, int monthSubscription, Plan plantype){
        this.monthSubscription = monthSubscription;
        this.name = name;
        this.plantype = plantype;
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            int currentMonth = 1;

            @Override
            public boolean hasNext() {
                return currentMonth <= monthSubscription;
            }

            @Override
            public String next() {
                String toReturn = "Client %s: Month %d earned %d miles for $%d.00".formatted(name, currentMonth, plantype.getTotalMiles(currentMonth), plantype.getPrice());
                currentMonth++;
                return toReturn;
            }
        };
    }



}
