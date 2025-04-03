package Practicas.practica3.ej6;

import java.util.Objects;

public class ComplexNumber {
    private final double realPart;
    private final double imagniaryPart;

    public ComplexNumber(double a, double b){
        realPart = a;
        imagniaryPart = b;
    }
    public ComplexNumber(Number a){
        realPart = a.doubleValue();
        imagniaryPart = 0;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof ComplexNumber complex && //se fija que sean del mismo tipo y le asigna el nombre complex al objeto
                Double.compare(this.realPart, complex.realPart) == 0 && //compara los valores de la parte real
                Double.compare(this.imagniaryPart, complex.imagniaryPart) == 0; //compara los valores de la parte imaginaria

    }

//    public ComplexNumber plus(Object o){
//        if(o instanceof ComplexNumber compx){
//            return new ComplexNumber(compx.realPart + this.realPart, compx.imagniaryPart + this.imagniaryPart);
//        }
//        else if(o instanceof Double num){
//            return new ComplexNumber(this.realPart + num);
//        }
//        return new ComplexNumber(0);
//    } //HECHO POR MI, ANDA CASI BIEN

    public ComplexNumber plus(ComplexNumber cpx){
        return new ComplexNumber(this.realPart + cpx.realPart, this.imagniaryPart + cpx.imagniaryPart);
    }
    public ComplexNumber plus(Number num){
        return plus(new ComplexNumber(num));
    }

    @Override
    public String toString(){
        return "%.2f %c %.2f i".formatted(realPart, imagniaryPart > 0 ? '+' : '-', Math.abs(imagniaryPart));
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, imagniaryPart);
    }



    public double getRealPart(){
        return this.realPart;
    }
    public double getImagniaryPart(){
        return this.imagniaryPart;
    }



}
