package Practicas.practica3.ej9;

public class Triangle extends Figure{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

//    protected double distanceTo(Point otherPoint){
//        return Math.sqrt(Math.pow(this.p1.getX(),
//    }

    @Override
    public double area(){
        double semiPerimiter = perimeter() / 2;
        return Math.sqrt(semiPerimiter * (semiPerimiter - p1.distanceTo(p2))
                * (semiPerimiter - p2.distanceTo(p3)) * (semiPerimiter - p3.distanceTo(p1)));
    }

    @Override
    public double perimeter(){
        return p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
    }

    @Override
    public String toString() {
        return "Triangulo [ %s , %s , %s]".formatted(p1, p2, p3);
    }
}
