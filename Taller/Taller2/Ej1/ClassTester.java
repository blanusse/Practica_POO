package Taller.Taller2.Ej1;

public class ClassTester {

    public static void main(String args[]) {
        ClassA instance;
        instance = new ClassA();
        System.out.println(instance.m1());
        System.out.println(instance.m2());
        System.out.println(instance.m3());
        instance = new ClassB();
        System.out.println(instance.m1());
        System.out.println(instance.m2());
        System.out.println(instance.m3());
        instance = new ClassC();
        System.out.println(instance.m1());
        System.out.println(instance.m2());
        System.out.println(instance.m3());
    }

}