package ParcialesViejos.Primeros.Q2_2022.ejercicio3;

import java.time.LocalDate;

public class Loan {
    private double amount;
    private LocalDate date;
    private int installmentsLeft;
    private Destinatary dest;



    public Loan(double amount, LocalDate date, int installments, Destinatary dest){
        this.amount = amount;
        this.date = date;
        this.dest = dest;
        this.installmentsLeft = installments;

    }

    public boolean canPay(int installment, LocalDate payDay){
        return installment>0 && !payDay.isBefore(date);
    }
    public void pay(int installment, LocalDate payDay) throws LoanException {
        if(!canPay(installment, payDay)){
            throw new LoanException("Cannot pay");
        }
        System.out.printf("Paying quota %d on date %s.\n", installment, payDay);
        installmentsLeft--;
    }

    @Override
    public String toString(){
        return "%s Loan of $%.0f. Remaining installments: %d".formatted(dest, amount, installmentsLeft);

    }
}
