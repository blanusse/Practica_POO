package ParcialesViejos.Q2_2022.ejercicio3;

import java.time.LocalDate;

public class Loan2 extends Loan{
    private int lastInstallmentPaid;

    public Loan2(double amount, LocalDate date, int installments, Destinatary dest) {
        super(amount, date, installments, dest);
        this.lastInstallmentPaid = 0;
    }

    @Override
    public void pay(int installment, LocalDate payDay) throws LoanException {
        super.pay(installment, payDay);
        lastInstallmentPaid = installment;
    }

    @Override
    public boolean canPay(int installment, LocalDate payDay){
        return super.canPay(installment, payDay) && installment == lastInstallmentPaid+1;
    }



}
