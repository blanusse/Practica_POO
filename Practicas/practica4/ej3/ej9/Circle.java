package Practicas.practica4.ej3.ej9;

import Practicas.practica4.ej3.Point;

public class Circle extends Ellipse {

    public Circle(Point cP, double rad){
        super(cP, 2*rad, 2*rad);
    }


    @Override
    public String toString(){
        return "Circulo [Centro: %s , Radio: {%.2f}]".formatted(centerPoint, majorAxis/2);
    }

}
