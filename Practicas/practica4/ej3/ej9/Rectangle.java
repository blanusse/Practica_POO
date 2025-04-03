package Practicas.practica4.ej3.ej9;

import Practicas.practica4.ej3.Point;

public class Rectangle extends Figure {
    protected Point topLeft;
    protected Point bottomRight;


    public Rectangle(Point tL, Point bR) {
        this.topLeft = tL;
        this.bottomRight = bR;
    }

    public double base() {
        return Math.abs(this.bottomRight.getX() - this.topLeft.getX());
    }

    public double height() {
        return Math.abs(this.topLeft.getY() - this.bottomRight.getY());
    }

    @Override
    public double area() {
        return height() * base();
    }

    @Override
    public double perimeter() {
        return height() * 2 + base() * 2;
    }

    @Override
    public String toString() {
        return "Rectángulo [ %s , %s ]".formatted(topLeft, bottomRight);
    }
}
