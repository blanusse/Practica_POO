package Practicas.practica4.ej6;

public class AndExpression extends BinaryExpression{


    public AndExpression(Expression l, Expression r){
        super(l, r);
    }

    @Override
    public boolean evaluate() {
        if(this.leftExp.evaluate() && this.rightExp.evaluate()){
            return true;
        }
        return false;
    }
}
