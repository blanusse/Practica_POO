package practica1.ej2;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    public ComplexNumber(int real, int imag){
        realPart = real;
        imaginaryPart = imag;
    }
    //Cuando no recibe un numero imaginario asume que es cero
    public ComplexNumber (int real){
        realPart = real;
        imaginaryPart = 0;
    }
    public int getRealPart(){
        return realPart;
    }
    public int getImaginaryPart(){
        return imaginaryPart;
    }
    public ComplexNumber plus(ComplexNumber num1, ComplexNumber num2){
        int newReal = num1.realPart + num2.realPart;
        int newImag = num1.imaginaryPart + num2.imaginaryPart;
        return new ComplexNumber(newReal, newImag);
    }
}
