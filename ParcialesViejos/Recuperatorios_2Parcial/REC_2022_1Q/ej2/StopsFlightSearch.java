package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej2;

import java.util.Comparator;

public class StopsFlightSearch extends AbstractSearch{

    public StopsFlightSearch(String airport) {
        super(new Comparator<Flight>(){
            @Override
            public int compare(Flight o1, Flight o2){
                int cmp = o1.getStops() - o2.getStops();
                if(cmp == 0){
                    cmp = o1.getCode().compareTo(o2.getCode());
                }
                return cmp;
            }
        }, airport);
    }
}
