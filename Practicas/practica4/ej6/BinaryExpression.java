package Practicas.practica4.ej6;

public abstract class BinaryExpression extends Expression{
    protected Expression leftExp;
    protected Expression rightExp;


    public BinaryExpression(Expression l, Expression r){
        this.leftExp = l;
        this.rightExp = r;
    }

}
