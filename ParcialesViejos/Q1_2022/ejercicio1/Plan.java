package ParcialesViejos.Q1_2022.ejercicio1;

public enum Plan {
    CLUB_1000(1000, 950, 0, 0),
    CLUB_2000(2000, 1750, 1000, 2),
    CLUB_5000(5000, 4400, 2500, 5),
    CLUB_10000(10000, 14400, 10000, 6);

    private int milesPerMonth, price, extraMiles, promotionDuration;

    Plan(int milesPerMonth, int price, int extraMiles, int promotionDuration){
        this.extraMiles = extraMiles;
        this.milesPerMonth = milesPerMonth;
        this.price = price;
        this. promotionDuration = promotionDuration;
    }


    int getTotalMiles(int month){
        int toReturn = milesPerMonth;
        if(month <= promotionDuration){
            toReturn+=extraMiles;
        }
        return toReturn;
    }

    int getPrice(){
        return price;
    }
}
