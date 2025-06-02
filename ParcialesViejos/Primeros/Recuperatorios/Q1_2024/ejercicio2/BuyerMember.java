package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio2;

public class BuyerMember {
    private BuyerLevelProgram program;
    private int points;
    private String name;
    private int id;
    private LevelType type;
    private static final int GOLD_ENTRY = 100, PREMIUM_ENTRY = 500;

    public BuyerMember(BuyerLevelProgram program, String name){
        this.program = program;
        this.points =0;
        this.name = name;
        this.type = LevelType.ENTRY;
        this.id = program.getCurrentId();
    }


    public void addPointsFromPurchase(int price){
        if(price < 0){
            throw new InvalidPurchaseException();
        }
        this.points += type.getPoints(price);
        if(program.isEnabled()){
            this.type = type.levelUp(points);
        }
    }


    @Override
    public String toString(){
        return "Member %d %s has %d points and level %s".formatted(id, name, points, type);
    }






}
