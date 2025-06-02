package Practicas.Practica6.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ej2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(81);
        list.add(10);
//        for (Integer i : list) { //falla aca porque se elimina con el iterador, se deberia usar un removeIf
//            if (i % 2 == 0) {
//                list.remove(i);
//            }
//        }
        list.removeIf(integer -> integer%2 == 0);

        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}