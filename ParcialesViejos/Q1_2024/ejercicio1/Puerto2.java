package ParcialesViejos.Q1_2024.ejercicio1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Puerto2 extends Puerto{
    private LocalTime openTime;
    private LocalTime closeTime;

    public Puerto2(String name, FerryCompany company, int muelles, LocalTime openTime, LocalTime closeTime) {
        super(name, company, muelles);
        this.openTime = openTime;
        this.closeTime = closeTime;
    }



    @Override
    public boolean canDock(Ferry ferryName, LocalTime dockTime){
        return  !dockTime.isBefore(openTime) && !dockTime.isAfter(closeTime) &&super.canDock(ferryName, dockTime);
    }
}
