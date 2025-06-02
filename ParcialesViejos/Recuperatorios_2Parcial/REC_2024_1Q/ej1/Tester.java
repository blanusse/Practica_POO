package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_1Q.ej1;

public class Tester {
    public static void main(String[] args){
        // Se instancia una colección de "palabras" donde cada uno de los elementos
// está asociado a una posición y la colección acepta repetidos
        GroupMatchCollection<String> sC = new GroupMatchCollectionImpl<>();
        sC.add("Mundo"); sC.add("Hola"); sC.add("Hola");
        System.out.println(sC.size()); // 3
        System.out.println(sC.get(0)); // Mundo
        System.out.println(sC.get(1)); // Hola
        System.out.println(sC.get(2)); // Hola
        System.out.println(sC.contains("Mundo")); // true


// Se agrega el predicado "palabras" con longitud mayor o igual a 4 caracteres
        sC.addMatchPredicate(e -> e.length() >= 4);


// Los predicados no impactan en los elementos ya agregados
// ni en el agregado de nuevos elementos
        sC.add("Abc"); sC.add("Wxyz");
        System.out.println(sC.size()); // 5
        System.out.println(sC.get(3)); // Abc


        sC.addMatchPredicate(e -> e.contains("o"));
        sC.add("Lol!");


// Se imprimen los elementos que no cumplen ningún predicado, en orden de INSERCION
        for(String e : sC.groupingByMatches().get(0)) {
            System.out.println(e);
        }
// Abc


// Se imprimen los elementos que cumplen 1 solo predicado, en orden de INSERCION
        for(String e : sC.groupingByMatches().get(1)) {
            System.out.println(e);
        }
// Wxyz


// Se imprimen los elementos que cumplen los 2 predicados, en orden de INSERCION
        for(String e : sC.groupingByMatches().get(2)) {
            System.out.println(e);
        }
// Mundo
// Hola
// Hola
// Lol!


// No hay elementos que cumplan 3 predicados porque sólo se agregaron 2
        System.out.println(sC.groupingByMatches().get(3)); // null


    }
}
