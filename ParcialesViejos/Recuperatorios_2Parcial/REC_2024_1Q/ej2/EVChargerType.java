package ParcialesViejos.Recuperatorios_2Parcial.REC_2024_1Q.ej2;

public enum EVChargerType {
   ENTRY(5), RAPID(10), SUPER(20);


   private final double kWhCost;
  
   EVChargerType(double kWhCost) {
       this.kWhCost = kWhCost;
   }

   public double getCost(int hours){
       return this.kWhCost * hours;
   }

}
