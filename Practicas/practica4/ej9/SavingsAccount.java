package Practicas.practica4.ej9;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id){
        super(id);
    }

    protected boolean canExtract(double amount){
        if(amount <= this.getBalance()){
            return true;
        }
        throw new IllegalArgumentException("No cuenta con los fondos necesarios");

    }
}
