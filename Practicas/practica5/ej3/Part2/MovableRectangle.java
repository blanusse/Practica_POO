package Practicas.practica5.ej3.Part2;

public class MovableRectangle extends Rectangle implements MovableFigure {

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        super(topLeft, bottomRight);
    }

    @Override
    public MovablePoint[] getPoints() {
        return new MovablePoint[]{(MovablePoint) topLeft, (MovablePoint) bottomRight};
    }

}
