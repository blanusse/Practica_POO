package Taller.Taller2.Ej1;

public class ClassB  extends ClassA{
    int m1(){
        return m2();
    }
    int m2(){
        return 2;
    }
    int m3(){
        return super.m2();
    }

}
