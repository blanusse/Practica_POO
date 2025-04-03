package Practicas.practica4.ej3;

public interface MovableFigure extends Movable{
    Movable[] getPoints();


    @Override
    default void moveNorth(double delta) {
        for(Movable movablePoint : getPoints()) {
            movablePoint.moveNorth(delta);
        }
    }

    @Override
    default void moveSouth(double delta) {
        for(Movable movablePoint : getPoints()) {
            movablePoint.moveSouth(delta);
        }
    }

    @Override
    default void moveWest(double delta) {
        for(Movable movablePoint : getPoints()) {
            movablePoint.moveWest(delta);
        }
    }

    @Override
    default void moveEast(double delta) {
        for(Movable movablePoint : getPoints()) {
            movablePoint.moveEast(delta);
        }
    }

}
