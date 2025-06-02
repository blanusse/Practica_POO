package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio3;

import java.util.Comparator;

public class DescendingDaysGarage extends Garage{

    @Override
    public Stay[] getStaysCopy(){
        return super.orderGarage(new Comparator<Stay>(){
            @Override
            public int compare(Stay o1, Stay o2){
                int cmp = o2.getDays() - o1.getDays();
                if(cmp ==0){
                    cmp = o1.getPlate().compareTo(o2.getPlate());
                }
                return cmp;
            }
        });
    }
}
