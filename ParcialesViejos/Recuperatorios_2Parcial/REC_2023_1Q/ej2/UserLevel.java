package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_1Q.ej2;

public enum UserLevel {
    GREEN(3), GOLD(1), BLACK(0);

    private int minReviews;
    UserLevel(int minReviews){
        this.minReviews = minReviews;
    }

    public boolean canReview(int productReviews) {
        if(this == UserLevel.BLACK){
            return true;
        }
        return this.minReviews <= productReviews;
    }
}
