package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio1;

import java.time.MonthDay;

public class Account3 extends Account2{
    private final static double MIN_DEPOSIT = 100000;
    private final static double MAX_BALANCE_INTEREST = 1000000;
    private static final double TNA = 0.3;


    public Account3(MonthDay creationDate){
      super(creationDate);
    }
 
//Nuevos requisitos para depositar, entonces se overridea
  @Override
  protected boolean canDeposit(double amount, MonthDay date){
      return super.canDeposit(amount, date) && amount > MIN_DEPOSIT;
  }
 
//Si el balance supera el millon, se debe usar la funcion de intereses con el tope de un millon
  @Override
  public void interestPayment(int days){
      for(int i=0; i<days; i++){
          if(this.getBalance() > MAX_BALANCE_INTEREST){
              this.addFunds(MAX_BALANCE_INTEREST*TNA*(1.0/365));
          }
          else{
              this.addFunds(this.getBalance()*TNA*(1.0/365));
          }
      }
  }
 
 
}