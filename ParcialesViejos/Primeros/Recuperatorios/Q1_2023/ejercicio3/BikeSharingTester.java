package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio3;

public class BikeSharingTester {
    public static void main(String[] args) {
// Se crea un pase para miembros para el usuario Phill
        MemberPass memberBikePass = new MemberPass("Phill");
        System.out.println(memberBikePass);
// Member Bike Pass used 0 times for Phill with $0.00 balance
// Se alquila una bicicleta de tipo CLASSIC de costo $100
        memberBikePass.ride(BikeType.CLASSIC);
        System.out.println(memberBikePass);
// Member Bike Pass used 1 times for Phill with $100.00 balance
        try {
// Falla pues no se satisface el requisito mínimo de 3 viajes realizados
// con el pase para alquilar una bicicleta de tipo ELECTRIC
            memberBikePass.ride(BikeType.ELECTRIC);
        } catch (CannotRideBikeException ex) {
            System.out.println(ex.getMessage()); // Cannot Ride Bike
        }
        memberBikePass.ride(BikeType.CLASSIC);
        memberBikePass.ride(BikeType.CLASSIC);
// Se alquila una bicicleta de tipo ELECTRIC de costo $150
        memberBikePass.ride(BikeType.ELECTRIC);
        System.out.println(memberBikePass);
// Member Bike Pass used 4 times for Phill with $450.00 balance
// Se crea un pase para visitantes para alquilar hasta 4 bicicletas
        VisitorsPass visitorBikePass = new VisitorsPass(4);
        System.out.println(visitorBikePass);
// Visitor Bike Pass used 0 times with 4 max rides
// Se alquila una bicicleta de tipo CLASSIC
        visitorBikePass.ride(BikeType.CLASSIC);
        System.out.println(visitorBikePass);
// Visitor Bike Pass used 1 times with 4 max rides
        try {
// Falla pues no se satisface el requisito mínimo de 3 viajes realizados
// con el pase para alquilar una bicicleta de tipo ELECTRIC
            visitorBikePass.ride(BikeType.ELECTRIC);
        } catch (CannotRideBikeException ex) {
            System.out.println(ex.getMessage()); // Cannot Ride Bike
        }
        visitorBikePass.ride(BikeType.CLASSIC);
        visitorBikePass.ride(BikeType.CLASSIC);
        visitorBikePass.ride(BikeType.ELECTRIC);
        System.out.println(visitorBikePass);
// Visitor Bike Pass used 4 times with 4 max rides
        try {
// Falla pues ya se alcanzó la cantidad máxima de 4 alquileres para el pase
            visitorBikePass.ride(BikeType.CLASSIC);
        } catch (CannotRideBikeException ex) {
            System.out.println(ex.getMessage()); // Cannot Ride Bike
        }
    }
}