package teorica;

public class DateTester {
    public static void main(String[] args) {

        Date fechaDeHoy = new Date(2025, 3, 5);
        Date fechaDeAyer = new Date(2025, 3, 4);
        Date fechaDeHoyBis = fechaDeHoy;

        fechaDeHoy.setYear(2024);
//        System.out.println(fechaDeHoyBis.getYear());

        DateTime horaDeInicioDeClases = new DateTime(2025, 3, 5, 13, 0, 0);
        System.out.println(horaDeInicioDeClases.getHour());
        System.out.println(horaDeInicioDeClases.getYear());

        Date fechaDeHoy3 = horaDeInicioDeClases;

        fechaDeAyer.print();
        horaDeInicioDeClases.print();
//        fechaDeHoy3.print("xxx");


        System.out.println(horaDeInicioDeClases.isMorning());

        DateTime fechaDeHoy4 = DateTime.now();
        String test = DateTime.test();

        fechaDeHoy4.print();

    }
}