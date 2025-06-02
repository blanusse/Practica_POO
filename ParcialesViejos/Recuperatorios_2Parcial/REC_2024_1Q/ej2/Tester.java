package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_1Q.ej2;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;


public class Tester {
    public static void main(String[] args){
        // Ejemplo de uso de la clase java.time.LocalDateTime
        LocalDateTime aux = LocalDateTime.of(2024, 7, 2, 14, 15);
        System.out.println(aux); // 2024-07-02T14:15
        System.out.println(aux.compareTo(LocalDateTime.of(2024, 7, 3, 15, 0))); // -1

        EVCentral evC = new EVCentral();


// Se registra al conductor Elon donde su saldo a pagar es $0
// Si ya existe un registro con ese nombre se reinicia el saldo
        evC.register("Elon");
// Se consulta el saldo a pagar de Elon
// Si no existe un registro con ese nombre se arroja un error
        System.out.println(evC.balance("Elon")); // 0
// Elon realiza una carga usando un cargador SUPER el 2/7/2024 a las 14:15 por 2 horas
// Si ya existe una carga para el mismo nombre y fecha y hora se arroja un error
// Si no existe un registro con ese nombre se arroja un error
        evC.charge("Elon", LocalDateTime.of(2024, 7, 2, 14, 15), EVChargerType.SUPER, 2);
        System.out.println(evC.balance("Elon")); // 40.0 donde $40.0 = 20 kWh * 2 horas
        evC.charge("Elon", LocalDateTime.of(2024, 7, 1, 16, 0), EVChargerType.RAPID, 1);
        System.out.println(evC.balance("Elon")); // 50.0
        evC.charge("Elon", LocalDateTime.of(2024, 7, 1, 21, 30), EVChargerType.ENTRY, 4);
        System.out.println(evC.balance("Elon")); // 70.0
        evC.charge("Elon", LocalDateTime.of(2024, 5, 30, 12, 0), EVChargerType.SUPER, 3);
        System.out.println(evC.balance("Elon")); // 130.0




        try {
            evC.charge("Elon", LocalDateTime.of(2024, 7, 1, 21, 30), EVChargerType.SUPER, 2);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Charge already exists on client and datetime
        }
        try {
            evC.charge("Bolt", LocalDateTime.of(2024, 7, 1, 21, 30), EVChargerType.SUPER, 2);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Client is not registered
        }


        evC.register("Bolt");
        evC.charge("Bolt", LocalDateTime.of(2024, 7, 4, 12, 0), EVChargerType.RAPID, 2);
        System.out.println(evC.balance("Bolt")); // 20.0


// Se obtienen todas las fecha y hora de las cargas de Elon en ORDEN CRONOLOGICO
// Si no tiene cargas se obtiene una colección vacía.
// Si no existe un registro con ese nombre se arroja un error
        Set<LocalDateTime> elonChargeDateTimes = evC.getChargeDateTimes("Elon");
        for(LocalDateTime elonDateTime : elonChargeDateTimes) {
            System.out.println(elonDateTime);
        }
// 2024-05-30T12:00
// 2024-07-01T16:00
// 2024-07-01T21:30
// 2024-07-02T14:15


// Se obtienen todos los tipos de cargadores de las cargas de Elon en ORDEN CRONOLOGICO
// Si no tiene cargas se obtiene una colección vacía.
// Si no existe un registro con ese nombre se arroja un error
        Collection<EVChargerType> elonChargerTypes = evC.getChargerTypes("Elon");
        for(EVChargerType elonType : elonChargerTypes) {
            System.out.println(elonType);
        }
// SUPER
// RAPID
// ENTRY
// SUPER


        for(LocalDateTime boltDateTime : evC.getChargeDateTimes("Bolt")) {
            System.out.println(boltDateTime);
        }
// 2024-07-04T12:00


        for(EVChargerType boltType : evC.getChargerTypes("Bolt")) {
            System.out.println(boltType);
        }
// RAPID


        try {
            evC.getChargeDateTimes("Watt");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage()); // Client is not registered
        }

    }
}
