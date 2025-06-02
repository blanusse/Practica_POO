package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio2;

public class LoyaltyMember {
    private LoyaltyProgram program;
    private String name;
    private MemberType type;
    private int milesAmount;
    private int id;

    public LoyaltyMember(LoyaltyProgram program, String name, MemberType type){
        this.name = name;
        this.program = program;
        this.type = type;
        this.milesAmount =0;
        this.id = program.getCurrentId();
    }

    public void addMilesFromPurchase(double price){
        if(program.isPromotionActive()){
            milesAmount+=type.getExtraMiles(milesAmount);
        }
        milesAmount+=(int)type.getMilesPerPrice(price);
    }


    @Override
    public String toString(){
        return "Loyality Member %d from %s with %d miles".formatted(id, name, milesAmount);
    }
}
