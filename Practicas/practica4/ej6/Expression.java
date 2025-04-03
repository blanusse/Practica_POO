package Practicas.practica4.ej6;

public abstract class Expression {


    public abstract boolean evaluate();

    public Expression not(){
        return new NotExpression(this);
    }

    public Expression and(Expression exp){
        return new AndExpression(this, exp);
    }

    public Expression or(Expression exp){
        return new OrExpression(this, exp);
    }


}
