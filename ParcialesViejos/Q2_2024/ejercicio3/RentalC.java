package ParcialesViejos.Q2_2024.ejercicio3;

import java.time.LocalDate;

public class RentalC extends Rental{
    private int kmLimit;
    private int minDays;



    public RentalC(LocalDate start, String pickUpLocation, RentalCentral rentalCentral, int kmLimit, int minDays) throws RentalException {
        super(start, pickUpLocation, rentalCentral);
        this.kmLimit = kmLimit;
        this.minDays = minDays;
    }

    @Override
    public boolean canDrop(String dropLocation, LocalDate dropDate){
        return (rentalCentral.belongsIn(dropLocation) && dropDate.isAfter(startDate) && (dropDate.isAfter(startDate.plusDays(minDays)) || dropDate.equals(startDate.plusDays(minDays))));
    }

    @Override
    public void addKms(int km) throws RentalException{
        if(kms+km > kmLimit){
            throw new RentalException("Max Kms Limit");
        }
        kms +=km;
    }

    @Override
    public String toString(){
        return "%s from %s on %s has %s kms, at least %d days and up to %d kms".formatted("Max Km Rental", pickUpLocation, startDate, kms, minDays, kmLimit);
    }

}
