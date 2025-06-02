package ParcialesViejos.Segundos.Q2_2021.ej2;

public enum Membership {
    PRO(0), ADVANCED(8), BEGINNER(4);

    private final int maxVisits;

    Membership(int maxVisits){
        this.maxVisits = maxVisits;
    }

    public int getMaxVisits() {
        return this.maxVisits;
    }
}
