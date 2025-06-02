package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio2;

public class BuyerLevelTester {
    public static void main(String[] args) {
// Se instancia un programa de fidelidad con los ascensos de nivel desactivado
        BuyerLevelProgram blp = new BuyerLevelProgram();
// Se habilita el ascenso de nivel por puntos en compras
        blp.enableLevelUp();
// Se otorga una membresía para el comprador Alan
        BuyerMember alan = new BuyerMember(blp,
                "Alan");
        System.out.println(alan); // Member 1001 Alan has 0 points and level ENTRY
// Se suman los puntos correspondientes a la compra
        alan.addPointsFromPurchase(100); // $100 suma 10% => 10 puntos
        alan.addPointsFromPurchase(500); // $500 suma 10% => 50 puntos
        System.out.println(alan); // Member 1001 Alan has 60 points and level ENTRY
        alan.addPointsFromPurchase(500);// $500 suma 10% => 50 puntos y asciende
        System.out.println(alan); // Member 1001 Alan has 110 points and level GOLD
        BuyerMember melanie = new BuyerMember(blp,
                "Melanie");
        melanie.addPointsFromPurchase(50000); // $50.000 suma 10% => 5000 puntos y asciende
        System.out.println(melanie); // Member 1002 Melanie has 5000 points and level GOLD
// Se deshabilita el ascenso de nivel por puntos en compras
        blp.disableLevelUp();
        melanie.addPointsFromPurchase(100); // $100 suma 20% => 20 puntos
        System.out.println(melanie); // Member 1002 Melanie has 5020 points and level GOLD
        blp.enableLevelUp();
        melanie.addPointsFromPurchase(100); // $100 suma 20% => 40 puntos
        System.out.println(melanie); // Member 1002 Melanie has 5040 points and level PREMIUM
// Se instancia otro programa de fidelidad con los ascensos de nivel desactivado
        BuyerLevelProgram otherBlp = new BuyerLevelProgram();
        BuyerMember roy = new BuyerMember(otherBlp,
                "Roy");
        System.out.println(roy); // Member 1003 Roy has 0 points and level ENTRY
        roy.addPointsFromPurchase(50000); // $50.000 suma 10% => 5000 puntos
        System.out.println(roy); // Member 1003 Roy has 5000 points and level ENTRY
        try {
            roy.addPointsFromPurchase(-5000); // Falla pues el monto no puede ser negativo
        } catch (InvalidPurchaseException ex) {
            System.out.println(ex.getMessage()); // Invalid Purchase
        }
    }
}