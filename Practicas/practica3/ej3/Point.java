package Practicas.practica3.ej3;



public class Point {
    private final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    @Override
    public String toString() {
        return "{%g, %g}".formatted(x, y);
    }
    @Override
    public boolean equals(Object o) {
        return o instanceof Point point &&
                Double.compare(x, point.x) == 0 &&
                Double.compare(y, point.y) == 0;
    }

//    @Override
//    public int hashCode() {
//        return this.Objects.hash(x, y);
//    }



}


//Para mi devuelven ---------- devuelve en realidad

//false -------- false
//true ---------- false
//true ---------- falla
//true -----------true
//falla ----------falla
//basura -------- falla
//2, 1 -----------2.00000 , 1.00000