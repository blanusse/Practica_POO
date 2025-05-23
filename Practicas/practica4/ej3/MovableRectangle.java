package Practicas.practica4.ej3;

import Practicas.practica4.ej3.ej9.Rectangle;

public class MovableRectangle extends Rectangle implements MovableFigure {

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        super(topLeft, bottomRight);
    }

    @Override
    public MovablePoint[] getPoints() {
        return new MovablePoint[]{(MovablePoint) topLeft, (MovablePoint) bottomRight};
    }

}

