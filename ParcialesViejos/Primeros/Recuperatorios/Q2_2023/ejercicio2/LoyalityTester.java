package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio2;

public class LoyalityTester {
    public static void main(String[] args) {
        // Se instancia un programa de pasajeros frecuentes con la promoción desactivada
        LoyaltyProgram lP = new LoyaltyProgram();
// Se otorga una membrersía con la categoría SILVER para el pasajero Ted
        LoyaltyMember silverMember = new LoyaltyMember(lP, "Ted", MemberType.SILVER);
        System.out.println(silverMember); // Loyalty Member 1001 from Ted with 0 miles
// Se suman las millas correspondientes a una compra de $100
        silverMember.addMilesFromPurchase(100.0); // $100 suman $100 x 10 = 1000 millas
        silverMember.addMilesFromPurchase(200.0); // $200 suman $200 x 10 = 2000 millas
        System.out.println(silverMember); // Loyalty Member 1001 from Ted with 3000 miles
        lP.setPromotionIsActive(true); // Se activa la promoción
        silverMember.addMilesFromPurchase(300.0); // $300 suman ($300 x 10) + 100 = 3100 millas
        System.out.println(silverMember); // Loyalty Member 1001 from Ted with 6100 miles
// Se otorga una membrersía con la categoría GOLD para la pasajera Rebecca
        LoyaltyMember goldMember = new LoyaltyMember(lP, "Rebecca", MemberType.GOLD);
        goldMember.addMilesFromPurchase(100.0); // $100 suman ($100 x 20) = 2000 millas
        System.out.println(goldMember); // Loyalty Member 1002 from Rebecca with 2000 miles
        goldMember.addMilesFromPurchase(100.0); // $100 suman ($100 x 20) + 500 = 2500 millas
        System.out.println(goldMember); // Loyalty Member 1002 from Rebecca with 4500 miles
        lP.setPromotionIsActive(false); // Se desactiva la promoción
        goldMember.addMilesFromPurchase(200.0); // $200 suman ($200 x 20) = 4000 millas
        System.out.println(goldMember); // Loyalty Member 1002 from Rebecca with 8500 miles
// Se instancia un segundo programa de pasajeros frecuentes
        LoyaltyProgram otherLP = new LoyaltyProgram();
        otherLP.setPromotionIsActive(true);
// Se otorga una membrersía con la categoría DIAMOND para el pasajero Roy
        LoyaltyMember diamondMember = new LoyaltyMember(otherLP, "Roy", MemberType.DIAMOND);
        System.out.println(diamondMember); // Loyalty Member 1003 from Roy with 0 miles
        diamondMember.addMilesFromPurchase(400.0); // $400 suman ($400 x 30) + 1000 = 13000 millas
        System.out.println(diamondMember); // Loyalty Member 1003 from Roy with 13000 miles
    }
}
