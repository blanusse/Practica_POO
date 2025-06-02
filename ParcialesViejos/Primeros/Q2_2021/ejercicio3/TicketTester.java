package ParcialesViejos.Primeros.Q2_2021.ejercicio3;

public class TicketTester {
    public static void main(String[] args) {
        TicketOffice ticketOffice = new TicketOffice();
// Se adquiere un ticket para esquiadores de 3 viajes
        Ticket t1 = ticketOffice.buySkiTicket(3);
        System.out.println(t1);
// Se realiza un viaje con el ticket 1001
// en una aerosilla de tipo AMANCAY
        ticketOffice.ride(t1, AeroChairType.AMANCAY);
        System.out.println(t1);
// Se realizan dos viajes con el ticket 1001
// en una aerosilla de tipo SIXFOLD
        ticketOffice.ride(t1, AeroChairType.SIXFOLD);
        ticketOffice.ride(t1, AeroChairType.SIXFOLD);
        System.out.println(t1);
        try {
// Se realiza un viaje con el ticket 1001
// en una aerosilla de tipo HORSETOOTH
// Falla pues ya se gastaron los tres viajes del ticket 1001
            ticketOffice.ride(t1, AeroChairType.HORSETOOTH);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("##########");
// Se adquiere un ticket para visitantes de 2 viajes
        Ticket t2 = ticketOffice.buyVisitorTicket(2);
        System.out.println(t2);
        try {
// Se realiza un viaje con el ticket 1002
// en una aerosilla de tipo AMANCAY
// Falla pues AMANCAY es exclusiva para esquiadores
            ticketOffice.ride(t2, AeroChairType.AMANCAY);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(" ---------- ");
// Se realizan dos viajes con el ticket 1002
// en una aerosilla de tipo HORSETOOTH
        ticketOffice.ride(t2, AeroChairType.HORSETOOTH);
        ticketOffice.ride(t2, AeroChairType.HORSETOOTH);
        System.out.println(t2);
        System.out.println("##########");
// Se adquiere un ticket para esquiadores de 1 viaje
        System.out.println(new TicketOffice().buySkiTicket(1));
    }
}