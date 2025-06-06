package Practicas.practica5.ej3.Part2;

public class MovablePoint extends Point implements Movable {

    public MovablePoint(double x, double y) {
        super(x, y);
    }

    @Override
    public void moveNorth(double delta) {
        y += delta;
    }

    @Override
    public void moveSouth(double delta) {
        y -= delta;
    }

    @Override
    public void moveWest(double delta) {
        x -= delta;
    }

    @Override
    public void moveEast(double delta) {
        x += delta;
    }

}
