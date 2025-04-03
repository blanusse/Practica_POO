package Taller.Taller2.Ej1;

public class ClassC extends ClassB{
    int m1(){
        return 3;
    }
    int m2(){
        return super.m2();
    }
    int m3(){
        return m3();
    }
}
