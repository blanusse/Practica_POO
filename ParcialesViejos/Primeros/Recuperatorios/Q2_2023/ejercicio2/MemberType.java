package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio2;

public enum MemberType {
    SILVER(10, 100){
        @Override
        public boolean canGetExtra(int milesAmount){
            return milesAmount > 1000;
        }
    },
    GOLD(20, 500){
    @Override
    public boolean canGetExtra(int milesAmount){
        return milesAmount > 1000 && milesAmount <5000;
    }

    },
    DIAMOND(30, 1000){
        @Override
        public boolean canGetExtra(int milesAmount){
            return true;
        }

    };

    private int milePerPrice;
    private int extraMilesAmount;

    MemberType(int milePerPrice, int extraMilesAmount){
        this.extraMilesAmount = extraMilesAmount;
        this.milePerPrice = milePerPrice;
    }

    public abstract boolean canGetExtra(int milesAmount);


    public double getMilesPerPrice(double price){
        return this.milePerPrice*price;
    }

    public int getExtraMiles(int miles) {
        if(canGetExtra(miles)){
            return this.extraMilesAmount;
        }
        return 0;
    }
}
