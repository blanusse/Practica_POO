package ParcialesViejos.Primeros.Recuperatorios.Q2_2022.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class CustomOrderedIterationTester {
public static void main(String[] args) {
String[] stringArray = {"aaa","xxx","zzz", "yyy"};
String stringStopElement = "xxx";
CustomOrderedIteration<String> stringIt = new CustomOrderedIteration<>(
        stringArray, Comparator.reverseOrder(), // Criterio de Orden Descendente
        stringStopElement // Elemento de fin
);
System.out.println(Arrays.toString(stringArray)); // [aaa, xxx, zzz, yyy]
// Se imprimen los elementos de stringArray en orden descendente
// hasta que aparezca el elemento de fin "xxx"
    Iterator<String> it1 = stringIt.iterator();
    while(it1.hasNext()) {
        System.out.println(it1.next());
    }
/**
 * zzz
 * yyy
 */
// Se cambia el elemento de fin
    stringIt.setStopElement("bbb");
// Se imprimen los elementos de stringArray en orden descendente
// hasta que aparezca el elemento de fin "bbb" (como no aparece se imprimen todos)
    Iterator<String> it2 = stringIt.iterator();
    stringIt.setStopElement("aaa");
    while(it2.hasNext()) {
        System.out.println(it2.next());
    }
/**
 * zzz
 * yyy
 * xxx
 * aaa
 */
    Person[] personArray = {new Person("Foo", "Bar"), new Person("Bar", "Foo")};
    Person personStopElement = new Person("John", "Doe");
    CustomOrderedIteration<Person> personIt = new CustomOrderedIteration<>(personArray, // Arreglo de elementos de tipo Person
// Criterio de Orden ascendente por nombre y desempata descendente por apellido
            new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    int cmp = o1.firstName.compareTo(o2.firstName);
                    if(cmp ==0){
                        cmp = o2.lastName.compareTo(o1.firstName);
                    }
                    return cmp;
                }
            },
            personStopElement // Elemento de fin
    );
// Se imprimen los elementos de personArray en orden ascendente por nombre
// y desempata descendente por apellido
// hasta que aparezca el elemento de fin John Doe (como no aparece se imprimen todos)
    for(Person element : personIt) {
        System.out.println(element);
    }
/**
 * Person Bar Foo
 * Person Foo Bar
 */
    personIt.setStopElement(new Person("Foo"
            ,
            "Bar"));
// Se imprimen los elementos de personArray en orden ascendente por nombre
// y desempata descendente por apellido
// hasta que aparezca el elemento de fin Foo Bar
    for(Person element : personIt) {
        System.out.println(element);
    }
/**
 *///* Person Bar Foo
}
    static class Person {
        private final String firstName, lastName;
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        @Override
        public boolean equals(Object o) {
            return this == o || (o instanceof Person person
                    && firstName.equals(person.firstName)
                    && lastName.equals(person.lastName));
        }
        @Override
        public String toString() {
            return String.format("Person %s %s"
                    , firstName, lastName);
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
    }
}