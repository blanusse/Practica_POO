package Taller.Taller6.ej1_2;

import java.util.*;

public class CitizenTester {
    public static void main(){
        Citizen cit1 = new Citizen(1, "Hola", "Chau");
        Citizen cit2 = new Citizen(2, "Hola2", "Chau");
        Citizen cit3 = new Citizen(3, "Hola2", "Chau3");
        Citizen cit4 = new Citizen(4, "halo", "o");

        Set<Citizen> collection = new HashSet<>();
        collection.add(cit1);
        collection.add(cit2);
        collection.add(cit3);
        collection.add(cit3);
        collection.add(cit4);

        System.out.println(collection);


//-----------------------------//-----------------------------//-----------------------------//-----------------------------

        Set<Citizen> collection2 = new TreeSet<>((o1, o2) -> o1.getDNI() - o2.getDNI());

        collection2.addAll(collection);
        System.out.println(collection2);

        Set<Citizen> collection3 = new TreeSet<>((o1, o2) -> o2.getDNI() - o1.getDNI());
        collection3.addAll(collection);
        System.out.println(collection3);


        //-----------------------------//-----------------------------//-----------------------------//-----------------------------

        SortedMap<Integer, Citizen> col4 = new TreeMap<>();

        col4.put(1, cit1);
        col4.put(2, cit2);
        col4.put(3, cit3);
        col4.put(4, cit4);

        System.out.println(col4);

    }
}
