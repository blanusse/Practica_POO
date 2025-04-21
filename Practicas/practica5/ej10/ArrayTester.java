package Practicas.practica5.ej10;


import java.util.Arrays;
import java.util.Comparator;

public class ArrayTester {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{7, 3, 1, 5, 9};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        Pair<String, String> stringPair1 = new Pair<>("hola", "mundo");
        Pair<String, String> stringPair2 = new Pair<>("hola", "adiós");
        Pair<String, String> stringPair3 = new Pair<>("buen", "día");
        Pair pairArray[] = new Pair[]{stringPair1, stringPair2, stringPair3};
        Arrays.sort(pairArray);
        System.out.println(Arrays.toString(pairArray));

//        Pair<String, String>[] otherPairArray = new Pair[4];
//        otherPairArray[1] = stringPair1;
//        otherPairArray[2] = stringPair2;
//        otherPairArray[3] = stringPair3;
//        Arrays.sort(otherPairArray);
//        System.out.println(Arrays.toString(otherPairArray));

        Arrays.sort(intArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); //ordena de mayor a menor
            }
        });
        System.out.println(Arrays.toString(intArray));

    }
}