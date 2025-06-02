package ParcialesViejos.Primeros.Q1_2024.ejercicio1;

import java.time.LocalTime;

public class Puerto3 extends Puerto2{
    private Ferry lastFerry;

    public Puerto3(String name, FerryCompany company, int muelles, LocalTime openTime, LocalTime closeTime) {
        super(name, company, muelles, openTime, closeTime);
    }

    @Override
    public void dock(Ferry ferryName, LocalTime dockTime){
        super.dock(ferryName, dockTime);
        lastFerry = ferryName;
    }

    @Override
    public void undock(Ferry ferryName, LocalTime unDockTime){
        if(lastFerry != ferryName){
            throw new RuntimeException();
        }
        super.undock(ferryName, unDockTime);
        lastFerry = null;
    }

}
