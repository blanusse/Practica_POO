package Practicas.practica5.ej3.Part2;

public class MovableTester {

    public static void main(String[] args) {
        MovablePoint aPoint = new MovablePoint(1,2);
        System.out.println(aPoint);
        aPoint.moveNorthEast(3,4);
        System.out.println(aPoint);

        MovableEllipse anEllipse = new MovableEllipse(aPoint,2,3);
        System.out.println(anEllipse);
        anEllipse.moveNorthEast(3,4);
        System.out.println(anEllipse);
    }

}
