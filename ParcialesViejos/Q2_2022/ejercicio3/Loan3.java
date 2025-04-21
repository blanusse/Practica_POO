package ParcialesViejos.Q2_2022.ejercicio3;

import java.time.LocalDate;

public class Loan3 extends Loan2{
    private LocalDate lastPayDate;

    public Loan3(double amount, LocalDate date, int installments, Destinatary dest) {
        super(amount, date, installments, dest);
    }

    @Override
    public boolean canPay(int installment, LocalDate payDay){
        return super.canPay(installment, payDay) && payDay.isAfter(lastPayDate);
    }

    @Override
    public void pay(int installment, LocalDate payDay) throws LoanException {
        super.pay(installment, payDay);
        lastPayDate = payDay;
    }
}
