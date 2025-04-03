package Practicas.practica4.ej3.ej9;

import Practicas.practica4.ej3.Point;

public class Ellipse extends Figure {
    protected final Point centerPoint;
    protected final double majorAxis;
    protected final double minorAxis;

    public Ellipse(Point cP, double majA, double minA){
        this.centerPoint = cP;
        this.majorAxis = majA;
        this.minorAxis = minA;
    }


    @Override
    public double area(){
        return (Math.PI) * minorAxis *majorAxis/4;
    }

    @Override
    public double perimeter() {
        return Math.PI / 2 * (majorAxis + minorAxis);
    }

    @Override
    public String toString(){
        return "Elipse [Centro: %s , dMayor: %.2f , dMenor: %.2f".formatted(centerPoint, majorAxis, minorAxis);
    }
}
