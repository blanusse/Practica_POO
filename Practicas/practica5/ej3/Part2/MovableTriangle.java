package Practicas.practica5.ej3.Part2;

public class MovableTriangle extends Triangle implements MovableFigure {

    public MovableTriangle(MovablePoint firstPoint, MovablePoint secondPoint, MovablePoint thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
    }

    @Override
    public MovablePoint[] getPoints() {
        return new MovablePoint[]{
                (MovablePoint) firstPoint,
                (MovablePoint) secondPoint,
                (MovablePoint) thirdPoint};
    }

}

