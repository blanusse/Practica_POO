package ParcialesViejos.Q1_2024.ejercicio2;

import java.rmi.NoSuchObjectException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PaymentPlan implements Iterator<PaymentDetail> {
    private int months;
    private double totalAmount;
    private PlanType type;
    private int current;

    public PaymentPlan(PlanType type, double totalAmount, int months) throws InvalidPaymentPlanException{
        if(!type.isValid(months) || totalAmount <= 0 || months <= 0) {
            throw new InvalidPaymentPlanException();
        }
        this.type =type;
        this.totalAmount = totalAmount/months;
        this.months = months;
        this.current = 1;
    }

    @Override
    public boolean hasNext() {
        return current<=months;
    }

    @Override
    public PaymentDetail next() {
        PaymentDetail toReturn = peek();
        current++;
        return toReturn;
    }

    public PaymentDetail peek(){
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return new PaymentDetail(current, type.apply(totalAmount, current));
    }


}
