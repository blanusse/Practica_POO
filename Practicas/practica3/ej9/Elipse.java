package Practicas.practica3.ej9;

public class Elipse extends Figure{
    protected final Point centralPoint;
    protected final double majorAxis;
    protected final double minorAxis;

    public Elipse(Point cP, double majA, double minA){
        this.centralPoint = cP;
        this.majorAxis = majA;
        this.minorAxis = minA;
    }


    @Override
    public double area(){
        return (Math.PI) * minorAxis *majorAxis/4;
    }

    @Override
    public double perimeter() {
        return Math.PI / 2 * (majorAxis + minorAxis);
    }

    @Override
    public String toString(){
        return "Elipse [Centro: %s , dMayor: %.2f , dMenor: %.2f".formatted(centralPoint, majorAxis, minorAxis);
    }
}
