package ParcialesViejos.Primeros.Q2_2024.ejercicio3;

import java.time.LocalDate;

public class Rental {
    protected final LocalDate startDate;
    protected final String pickUpLocation;
    protected final RentalCentral rentalCentral;
    protected int kms;

    public Rental(LocalDate start, String pickUpLocation, RentalCentral rentalCentral) throws RentalException{
        if(!rentalCentral.belongsIn(pickUpLocation)){
            throw new RentalException("PickUp Location");
        }
        this.kms = 0;
        this.startDate = start;
        this.pickUpLocation = pickUpLocation;
        this.rentalCentral = rentalCentral;
    }


    public void addKms(int km) throws RentalException{
        this.kms+=km;
    }

    public boolean canDrop(String dropLocation, LocalDate dropDate){
        return (rentalCentral.belongsIn(dropLocation) && dropDate.isAfter(startDate));
    }
}
