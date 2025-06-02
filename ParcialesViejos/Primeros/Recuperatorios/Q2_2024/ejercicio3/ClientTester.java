package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio3;

public class ClientTester {
    public static void main(String[] args){
        // Cliente Alice de tipo Turista donde el máximo monto a gastar es $15.000
Client alice = new TouristClient("Alice", 15000);
        System.out.println(alice); // Client Alice made 0 bookings
// Cliente Bob de tipo Ejecutivo donde la cantidad máxima de reservas es 3
        Client bob = new ExecutiveClient("Bob", 3);
        System.out.println(bob); // Client Bob made 0 bookings
// Alice realiza una reserva de una habitación Simple para 1 huésped por 2 noches
        alice.bookRoom(RoomType.SIMPLE, 1, 2); // 2 noches x $1.000 = $2.000
        System.out.println(alice); // Client Alice made 1 bookings
// Alice realiza una reserva de una habitación Suite para 2 huéspedes por 4 noches
        alice.bookRoom(RoomType.SUITE, 2, 4); // 4 noches x $3000 = $12.000
        System.out.println(alice); // Client Alice made 2 bookings
// Se arroja error pues el total acumulado de Alice daría $18.000 y eso supera el tope
        try {
            alice.bookRoom(RoomType.SIMPLE, 1, 4); // 4 noches x $1.000 = $4.000
        } catch (CannotBookException ex) {
            System.out.println(ex.getMessage()); // Cannot Book
        }
        System.out.println(alice); // Client Alice made 2 bookings
        bob.bookRoom(RoomType.SUITE, 1, 2);
        bob.bookRoom(RoomType.SUITE, 3, 4);
        bob.bookRoom(RoomType.SIMPLE, 1, 2);
        System.out.println(bob); // Client Bob made 3 bookings
        try { // Se arroja error pues la cantidad de reservas de Bob sería 4 y supera el tope
            bob.bookRoom(RoomType.SIMPLE, 1, 1);
        } catch (CannotBookException ex) {
            System.out.println(ex.getMessage()); // Cannot Book
        }
        System.out.println(bob); // Client Bob made 3 bookings
        try { // Se arroja error porque la cantidad de noches no es positiva
            alice.bookRoom(RoomType.SIMPLE, 1, 0);
        } catch (CannotBookException ex) {
            System.out.println(ex.getMessage()); // Cannot Book
        }
        try { // Se arroja error porque la habitación Simple sólo acepta un huésped
            alice.bookRoom(RoomType.SIMPLE, 3, 1);
        } catch (CannotBookException ex) {
            System.out.println(ex.getMessage()); // Cannot Book
        }
    }
}
