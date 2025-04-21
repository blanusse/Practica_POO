package Practicas.practica5.ej3.Part2;

public class Circle<P extends Point> extends Ellipse {

    public Circle(P centerPoint, double radius) {
        super(centerPoint, 2 * radius, 2 * radius);
    }

    @Override
    public String toString() {
        return String.format("Círculo [Centro: %s , Radio: %.2f}]", centerPoint, sMayorAxis / 2);
    }



}
