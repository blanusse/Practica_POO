package Practicas.practica4.ej11;


public class Polynomial {
    private double[] pol;

    public Polynomial(int grade) throws InvalidGradeException {
        if(grade < 0 ){
            throw new InvalidGradeException();
        }
        this.pol = new double[grade];
    }


    public void set(int idx, double num) throws InvalidIndexException {
        if(idx < 0 || idx >pol.length){
            throw new InvalidIndexException();
        }
        this.pol[idx] = num;
    }

    public double eval(double num){
        double toReturn = 0;
        for(int i=0; i<pol.length; i++){
            toReturn += this.pol[i] * Math.pow(num, i);
        }
        return toReturn;
    }

}
