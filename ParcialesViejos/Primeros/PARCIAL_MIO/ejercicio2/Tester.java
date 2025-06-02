package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio2;

import java.time.LocalTime;

public class Tester {

    public static void main(String[] args) {
// Ejemplo de uso de la clase java.time.LocalTime
        LocalTime currentTime = LocalTime.of(18,13);
        System.out.println(currentTime.isAfter(LocalTime.of(18,11))); // true
// Se instancia un tablero de partidas donde el tiempo actual del tablero es 18:13
        DeparturesBoard board = new DeparturesBoard(currentTime);
// Se agrega una partida al tablero de partidas, para el tren que sale a las 18:35
// con destino a Swindown desde la plataforma 3, indica true porque se agregó con éxito
        System.out.println(board.addDeparture(LocalTime.of(18,35),
                "Swindown"
                , 3)); // true
        System.out.println(board.addDeparture(LocalTime.of(18,36),
                "Salisbury"
                , 1)); // true
        System.out.println(board.addDeparture(LocalTime.of(18,44),
                "Gloucester"
                , 2)); // true
// Se obtienen las partidas en orden DE INSERCIÓN
        for (Departure departure : board.getDepartures()) {
            System.out.println(departure);
        }
// 18:35 | Swindown | P03 | ON TIME
// 18:36 | Salisbury | P01 | ON TIME
// 18:44 | Gloucester | P02 | ON TIME
        System.out.println(board.addDeparture(LocalTime.of(18,35),
                "Weymouth"
                , 2)); // true
// Como ya existe otra partida en el tablero otra partida con el mismo
// tiempo, destino y plataforma no se agrega, indica false
        System.out.println(board.addDeparture(LocalTime.of(18,35),
                "Weymouth"
                , 2)); // false
// Se modifica el tiempo actual del tablero a 18:36
        board.setCurrentTime(LocalTime.of(18,36));
// Se obtienen las partidas en orden DE INSERCIÓN
        for (Departure departure : board.getDepartures()) {
            System.out.println(departure);
        }
// 18:35 | Swindown | P03 | DEPARTED
// 18:36 | Salisbury | P01 | ON TIME
// 18:44 | Gloucester | P02 | ON TIME
// 18:35 | Weymouth | P02 | DEPARTED

        // Se obtienen las partidas en orden DESCENDENTE por plataforma,
// y desempata CRONOLOGICO por tiempo y ALFABETICO por estación
        for (Departure departure : board.getDeparturesDescendingByPlatform()) {
            System.out.println(departure);
        }
// 18:35 | Swindown | P03 | DEPARTED
// 18:35 | Weymouth | P02 | DEPARTED
// 18:44 | Gloucester | P02 | ON TIME
// 18:36 | Salisbury | P01 | ON TIME
        board.setCurrentTime(LocalTime.of(18,37));
// Se obtienen las partidas en orden ASCENDENTE por plataforma,
// y desempata DESCENDENTE por tiempo y DESCENDENTE por estación
        for (Departure departure : board.getDeparturesAscendingByPlatform()) {
            System.out.println(departure);
        }
// 18:36 | Salisbury | P01 | DEPARTED
// 18:44 | Gloucester | P02 | ON TIME
// 18:35 | Weymouth | P02 | DEPARTED
// 18:35 | Swindown | P03 | DEPARTED
    }
}
