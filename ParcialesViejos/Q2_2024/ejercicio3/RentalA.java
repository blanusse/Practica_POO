package ParcialesViejos.Q2_2024.ejercicio3;

import java.time.LocalDate;

public class RentalA extends Rental{

    public RentalA(LocalDate start, String pickUpLocation, RentalCentral rentalCentral) throws RentalException {
        super(start, pickUpLocation, rentalCentral);
    }

    @Override
    public String toString(){
        return "%s from %s on %s has %s kms".formatted("Rental", pickUpLocation, startDate, kms);
    }
}
