package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_1Q.ej2;

public enum SeatCategory implements Comparable<SeatCategory>{
   ECONOMY("ECONOMY"), PREMIUM("PREMIUM"), BUSINESS("BUSINESS");

   private String name;

   SeatCategory(String name) {
      this.name = name;
   }

   public String toString(){
      return name;
   }


}


