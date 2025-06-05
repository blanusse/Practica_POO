package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej2;

import java.util.Comparator;
import java.util.TreeSet;

public class SeatFlightSearch extends AbstractSearch{

    public SeatFlightSearch(String airport) {
        super(new Comparator<Flight>(){
            @Override
            public int compare(Flight o1, Flight o2){
                int cmp = o2.getCategory().compareTo(o1.getCategory());
                if(cmp == 0){
                    cmp = o1.getCode().compareTo(o2.getCode());
                }
                return cmp;
            }
        }, airport);
    }
}
