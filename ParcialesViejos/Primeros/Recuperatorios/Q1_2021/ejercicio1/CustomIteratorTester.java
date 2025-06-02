package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
public class CustomIteratorTester {
public static void main(String[] args) {
// Nuevo CustomIterator para obtener los enteros pares desde el 0 con:
// - Elemento Inicial: 0
// - Función para obtener el siguiente elemento: f(x) = x + 2
// - Condición de corte: No se provee, el iterador es infinito
UnaryOperator<Integer> iciNextFn = new UnaryOperator<Integer>() {
@Override
public Integer apply(Integer currentVal) {
return currentVal + 2;
}
};
Iterator<Integer> ici = new CustomIterator<>(0, iciNextFn);
System.out.println(ici.hasNext()); // Imprime true
System.out.println(ici.next()); // Imprime 0 (pues 0 es elemento inicial)
System.out.println(ici.next()); // Imprime 2 (pues 0 + 2)
System.out.println(ici.next()); // Imprime 4 (pues 0 + 2 + 2)
// No se provee condición de corte por lo que hasNext siempre retornará verdadero.
System.out.println(ici.hasNext()); // Imprime true
// Nuevo CustomIterator para obtener los reales desde el 5.00 con paso de 0.10:
// - Elemento Inicial: 5.00
// - Función para obtener el siguiente elemento: f(x) = x + 0.10
// - Condición de corte: x >= 5.25
UnaryOperator<Double> dciNextFun = new UnaryOperator<Double>() {
@Override
public Double apply(Double currentVal) {
return currentVal + 0.10;
}
};
Predicate<Double> dciCutCond = new Predicate<Double>() {
@Override
public boolean test(Double currentVal) {
return currentVal >= 5.25;
}
};
Iterator<Double> dci = new CustomIterator<>(5.0, dciNextFun, dciCutCond);
System.out.println(dci.hasNext()); // Imprime true
System.out.println(String.format("%.2f", dci.next())); // Imprime 5.00 (pues 5.00 es elemento inicial)
    System.out.println(String.format("%.2f", dci.next())); // Imprime 5.10 (pues 5.00 + 0.10)
    System.out.println(String.format("%.2f", dci.next())); // Imprime 5.20 (pues 5.00 + 0.10 + 0.10)
// La condición de corte aplicada al siguiente elemento del iterador (5.30) es verdadera
// por lo que no hay más elementos por iterar.
    System.out.println(dci.hasNext()); // Imprime false
    try {
        System.out.println(String.format("%.2f", dci.next()));  //Imprime No more elements
    } catch (NoSuchElementException ex) {
        System.out.println("No more elements");

    }
// Nuevo CustomIterator donde la condición de corte aplicada al elemento inicial es verdadera
    Iterator<String> stringCustIt = new CustomIterator<>("A", currentVal -> currentVal.concat("A"), currentVal -> currentVal.length() > 0);
    System.out.println(dci.hasNext()); // Imprime false
    try {
        System.out.println(stringCustIt.next());
    } catch (NoSuchElementException ex) {
        System.out.println("No more elements."); // Imprime No more elements
    }
}
}