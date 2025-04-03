package Practicas.practica4.ej3;

import Practicas.practica4.ej3.ej9.Triangle;

public class MovableTriangle extends Triangle implements MovableFigure {

    public MovableTriangle(MovablePoint firstPoint, MovablePoint secondPoint, MovablePoint thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
    }

    @Override
    public MovablePoint[] getPoints() {
        return new MovablePoint[]{
                (MovablePoint) p1,
                (MovablePoint) p2,
                (MovablePoint) p3};
    }

}
