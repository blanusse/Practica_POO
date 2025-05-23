package Practicas.practica4.ej12;

public class IntegerListTester {

    public static void main(String[] args) {
        LinearList integerList = new List();
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        System.out.println(integerList.indexOf(4)); // 1
        integerList.set(1, 10);
        System.out.println(integerList.indexOf(10)); // 1
        System.out.println(integerList.size()); // 4
        System.out.println(integerList.get(3)); // 5
        integerList.remove(3);
        System.out.println(integerList.size()); // 3
    }

}

