package ParcialesViejos.Primeros.Q2_2024.ejercicio3;

public class RentalCentral {

        private String[] rentalLocations;
        public RentalCentral(String[] rentalLocations) {
            setRentalLocations(rentalLocations);
        }
        public boolean belongsIn(String rentalLocation) {
            for(String rL : rentalLocations) {
                if(rL.equals(rentalLocation)) {
                    return true;
                }
            }
            return false;
        }
    public void setRentalLocations(String[] rentalLocations) {
        this.rentalLocations = rentalLocations;
    }
}
