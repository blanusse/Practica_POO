package Practicas.practica3.ej7;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id){
        super(id);
    }
    @Override
    protected boolean canExtract(double amount){
        return amount <= this.getBalance();
    }
}
