package Practicas.Practica6.ej4;


import java.util.HashSet;
import java.util.Set;

public class Bank {
    private final Set<BankAccount> accounts = new HashSet<>();




    public void addAccount(BankAccount acc){
        accounts.add(acc);
    }

    public int accountSize(){
        return accounts.size();
    }

    public double totalAmount(){
        double toReturn = 0;
        for(BankAccount acc : accounts){
            toReturn += acc.getBalance();
        }
        return toReturn;
    }


    public void removeAccount(BankAccount acc){
        accounts.remove(acc);

    }
}
