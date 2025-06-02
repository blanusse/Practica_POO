package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio1;

import java.time.MonthDay;

public class Account2 extends Account1{
    private MonthDay lastExtractionDate;
 
//Constructor que recibe la fecha de creacion y setea la fecha de la ultima extraccion como la fecha de creacion
    public Account2(MonthDay creationDate){
      super(creationDate);
      this.lastExtractionDate = creationDate;
    }
 
//como hay nuevos requisitos para extraer, se overridea con el nuevo requisito
  @Override
  protected boolean canWithdraw(double amount, MonthDay date){
      return super.canWithdraw(amount, date) && !date.isBefore(lastExtractionDate);
  }
 
//Ademas de retirar la plata (si es posible) se actualiza la fecha de ultima extraccion
  @Override
  public void withdrawFunds(double amount, MonthDay date){
    super.withdrawFunds(amount, date);
    this.lastExtractionDate = date;
  }
 
 
}