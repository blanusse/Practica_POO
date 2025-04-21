package ParcialesViejos.Q2_2024.ejercicio3;

import java.time.LocalDate;

public class RentalB extends Rental{
    private String dropLocation;
    private int limitDays;


    public RentalB(LocalDate start, String pickUpLocation, RentalCentral rentalCentral, int limitDays) throws RentalException {
        super(start, pickUpLocation, rentalCentral);
        this.limitDays = limitDays;
    }

    @Override
    public boolean canDrop(String dropLocation, LocalDate dropDate){
        return (rentalCentral.belongsIn(dropLocation) && dropDate.isAfter(startDate) && dropLocation.equals(pickUpLocation) && (!dropDate.isAfter(startDate.plusDays(limitDays)) || dropDate.equals(startDate.plusDays(limitDays))));
    }

    @Override
    public String toString(){
        return "%s from %s on %s has %s for up to %d days".formatted("Same Drop Rental", pickUpLocation, startDate, kms, limitDays);
    }

}
