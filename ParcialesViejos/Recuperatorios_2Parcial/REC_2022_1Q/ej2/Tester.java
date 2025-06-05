package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej2;

import java.util.*;

public class Tester {
    public static void main(String[] args){
        // Se instancia una sistema para listar los vuelos por cantidad de paradas
        StopsFlightSearch stopsFS = new StopsFlightSearch("EZE");
        stopsFS.addSearchResult("YUL", 1, "Air Canada", SeatCategory.ECONOMY);
        stopsFS.addSearchResult("JFK", 0, "American Airlines", SeatCategory.PREMIUM);
        stopsFS.addSearchResult("MIA", 1, "Avianca", SeatCategory.BUSINESS);
        stopsFS.addSearchResult("YVR", 2, "Air Canada", SeatCategory.ECONOMY);
        System.out.println(stopsFS); // Flight Search from EZE with 4 results

// Se listan primero los vuelos con menos paradas, y a igual cantidad de tramos,
// desempata alfabéticamente por aeropuerto destino.
        Iterator<String> stopsFSIt = stopsFS.resultsIterator();
        while(stopsFSIt.hasNext()) {
            System.out.println(stopsFSIt.next());
        }
// JFK | 0 | American Airlines | PREMIUM
// MIA | 1 | Avianca | BUSINESS
// YUL | 1 | Air Canada | ECONOMY
// YVR | 2 | Air Canada | ECONOMY

// Se instancia una sistema para listar los vuelos por compañía aérea
        AirlineFlightSearch airlineFS = new AirlineFlightSearch("EZE", "Air Canada");
        airlineFS.addSearchResult("YUL", 1, "Air Canada", SeatCategory.ECONOMY);
        airlineFS.addSearchResult("JFK", 0, "American Airlines", SeatCategory.PREMIUM);
        airlineFS.addSearchResult("MIA", 1, "Avianca", SeatCategory.BUSINESS);
        airlineFS.addSearchResult("YVR", 2, "Air Canada", SeatCategory.ECONOMY);
        System.out.println(airlineFS); // Flight Search from EZE with 2 results

// Sólo se listan los vuelos de la compañía aérea Air Canada
// con orden alfabéticamente por aeropuerto destino.
        Iterator<String> airlineFSIt = airlineFS.resultsIterator();
        while(airlineFSIt.hasNext()) {
            System.out.println(airlineFSIt.next());
        }
// YUL | 1 | Air Canada | ECONOMY
// YVR | 2 | Air Canada | ECONOMY

// Se instancia una sistema para listar los vuelos por tipo de asiento
        SeatFlightSearch seatFS = new SeatFlightSearch("EZE");
        seatFS.addSearchResult("YUL", 1, "Air Canada", SeatCategory.ECONOMY);
        seatFS.addSearchResult("JFK", 0, "American Airlines", SeatCategory.PREMIUM);
        seatFS.addSearchResult("MIA", 2, "Avianca", SeatCategory.BUSINESS);
        seatFS.addSearchResult("BOG", 0, "Avianca", SeatCategory.BUSINESS);
        System.out.println(seatFS); // Flight Search from EZE with 4 results

// Se listan primero los vuelos con mejor categoría de asiento, y a igual categoría,
// desempata alfabéticamente por aeropuerto destino
        Iterator<String> seatFSIt = seatFS.resultsIterator();
        while(seatFSIt.hasNext()) {
            System.out.println(seatFSIt.next());
        }
// BOG | 0 | Avianca | BUSINESS
// MIA | 2 | Avianca | BUSINESS
// JFK | 0 | American Airlines | PREMIUM
// YUL | 1 | Air Canada | ECONOMY


    }
}
