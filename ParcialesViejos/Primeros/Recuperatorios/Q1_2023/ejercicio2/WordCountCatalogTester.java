package ParcialesViejos.Primeros.Recuperatorios.Q1_2023.ejercicio2;

public class WordCountCatalogTester {
public static void main(String[] args) {
// Se instancia un catálogo de elementos WordCount que podrá iterarse
// en orden alfabético por la palabra y desempata ascendente por la cantidad
WordCountCatalog alphabeticalWordCatalog = new AlphabeticalWordCatalog();
// Agrega el elemento con la palabra ipsum y cantidad 4 al catálogo
alphabeticalWordCatalog.add(new WordCount("ipsum"
, 4));
alphabeticalWordCatalog.add(new WordCount("lorem", 2)) .add(new WordCount("in", 3)).add(new WordCount("in", 2));



// Se obtiene el primer elemento registrado (por orden de inserción)
WordCount firstWordCount = alphabeticalWordCatalog.getByIndex(0);
System.out.println(firstWordCount); // WC: ipsum -> 4
// Arroja un error porque se intenta obtener el quinto elemento registrado
// (por orden de inserción) y sólo se registraron cuatro
try {
alphabeticalWordCatalog.getByIndex(4);
} catch (IllegalArgumentException ex) {
System.out.println("Error"); // Error
}
// Itera por todos los elementos del catálogo con el orden mencionado arriba
for(WordCount element : alphabeticalWordCatalog) {
    System.out.println(element);
}
// WC: in - > 2
// WC: in -> 3
// WC: ipsum -> 4
// WC: lorem -> 2
// Se instancia un catálogo de elementos WordCount que podrá iterarse
// en orden descendente por la cantidad y desempata descendente por la palabra
        WordCountCatalog descendingCountCatalog = new DescendingCountCatalog();
// Agrega el elemento con la palabra ipsum y cantidad 4 al catálogo
        descendingCountCatalog.add(new WordCount("ipsum", 4));
        descendingCountCatalog.add(new WordCount("lorem", 2)) .add(new WordCount("in", 3)) .add(new WordCount("in", 2));



// Se obtiene el último elemento registrado (por orden de inserción)
        WordCount lastWordCount = descendingCountCatalog.getByIndex(3);
        System.out.println(lastWordCount); // WC: in -> 2
// Arroja un error porque el índice es negativo
        try {
            descendingCountCatalog.getByIndex(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error"); // Error
        }
// Itera por todos los elementos del catálogo con el orden mencionado arriba
        for(WordCount element : descendingCountCatalog) {
            System.out.println(element);
        }
// WC: ipsum -> 4
// WC: in -> 3
// WC: lorem -> 2
// WC: in -> 2
    }
}