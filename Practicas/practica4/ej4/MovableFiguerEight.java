package Practicas.practica4.ej4;



public interface MovableFiguerEight extends MovableEight {
    MovableEight[] getPoints();

    @Override
    default void moveNorth(double delta) {
        for(MovableEight movablePoint : getPoints()) {
            movablePoint.moveNorth(delta);
        }
    }

    @Override
    default void moveSouth(double delta) {
        for(MovableEight movablePoint : getPoints()) {
            movablePoint.moveSouth(delta);
        }
    }

    @Override
    default void moveWest(double delta) {
        for(MovableEight movablePoint : getPoints()) {
            movablePoint.moveWest(delta);
        }
    }

    @Override
    default void moveEast(double delta) {
        for(MovableEight movablePoint : getPoints()) {
            movablePoint.moveEast(delta);
        }
    }
}
