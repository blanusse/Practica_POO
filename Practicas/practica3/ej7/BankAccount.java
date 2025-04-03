package Practicas.practica3.ej7;


import java.util.Objects;

public abstract class BankAccount {
    private int id;
    private double balance;

    public BankAccount(int id){
        this.id = id;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void extract(double amount){
        if(canExtract(amount)){
            this.balance -= amount;
        }
        else{
            System.out.println("No es posible efectuar el retiro");
        }
    }

    protected abstract boolean canExtract(double amount);

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(this.id, this.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }

}
