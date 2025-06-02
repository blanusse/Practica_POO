package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio1;

import java.time.MonthDay;

public class Account1{
  private double balance;
  private MonthDay creationDate;
  private final static double TNA = 0.3;
  
//Constructor que recibe fecha de creacion
  public Account1(MonthDay creationDate){
    this.balance = 0;
    this.creationDate = creationDate;
  }
 
 
//Se verifica si se pueden hacer las operaciones, con los requisitos del enunciado
  protected boolean canDeposit(double amount, MonthDay date){
    return !date.isBefore(creationDate) && amount > 0;
}
 
  protected boolean canWithdraw(double amount, MonthDay date){
      return !date.isBefore(creationDate) && amount > 0 && this.balance >= amount;
  }
 
  
//Funciones para realizar operaciones
  public void depositFunds(double amount, MonthDay date){
    if(!canDeposit(amount, date)){
        throw new RuntimeException("Error");
    }
    this.balance +=amount;
  }
 
  public void withdrawFunds(double amount, MonthDay date){
    if(!canWithdraw(amount, date)){
        throw new RuntimeException("Error");
    }
    this.balance -= amount;
  }
 
//Funcion para la ganancia de intereses
  public void interestPayment(int days){
    for(int i=0; i<days;i++){
      this.balance += this.balance*TNA*(1.0/365);
    }
  }
 
  //getters
 
//Consultar el saldo
  public double getBalance(){
    return this.balance;
  }
 
//Aumentar el saldo
  protected void addFunds(double amount){
    this.balance += amount;
  }
 
 
 
}