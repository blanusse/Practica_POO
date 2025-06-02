package ParcialesViejos.Primeros.Recuperatorios.Q1_2024.ejercicio2;

public enum LevelType {
    ENTRY(10){
        @Override
        public boolean canLevelUp(int points){
            return points >=100;
        }
    }, GOLD(20){
        @Override
        public boolean canLevelUp(int points){
            return points >=500;
        }
    }, PREMIUM( 50){
        @Override
        public boolean canLevelUp(int points){
            return false;
        }
    };

    private int discount;


    LevelType(int discount){
        this.discount = discount;
    }

    public int getPoints(int price){
        return price * discount/100;
    }

    public abstract boolean canLevelUp(int points);


    public LevelType levelUp(int currentPoints) {
        if(canLevelUp(currentPoints)) {
            return LevelType.values()[ordinal()+1];
        }
        return this;
    }
}
