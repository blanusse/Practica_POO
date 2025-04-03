package Practicas.practica4.ej3;

import Practicas.practica4.ej3.ej9.Circle;

public class MovableCircle extends Circle implements MovableFigure {


    public MovableCircle(MovablePoint cp, double radius){
        super(cp, radius);
    }

    public MovablePoint[] getPoints(){
        return new MovablePoint[]{(MovablePoint) centerPoint};
    }
}
