package Practicas.practica4.ej9;

public class CheckingAccount extends BankAccount {
    private double overdraft;

    public CheckingAccount(int id, double overdraft){
        super(id);
        this.overdraft = overdraft;
    }
    @Override
    protected boolean canExtract(double amount){
        if(amount <= this.overdraft + amount){
            return true;
        }
        throw new IllegalArgumentException("No cuenta con los fondos necesarios");

    }


}
