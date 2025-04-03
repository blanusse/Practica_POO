package Practicas.practica4.ej6;

public class NotExpression extends Expression{
    private Expression value;

    public NotExpression(Expression value){
        this.value = value;
    }

    public boolean evaluate(){
        return !value.evaluate();
    }
}
