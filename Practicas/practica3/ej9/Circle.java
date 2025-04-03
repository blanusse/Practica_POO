package Practicas.practica3.ej9;

public class Circle extends Elipse{

    public Circle(Point cP, double rad){
        super(cP, 2*rad, 2*rad);
    }


    @Override
    public String toString(){
        return "Circulo [Centro: %s , Radio: {%.2f}]".formatted(centralPoint, majorAxis/2);
    }

}
