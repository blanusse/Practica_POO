package ParcialesViejos.Primeros.Q2_2022.ejercicio3;

public enum Destinatary {
    PERSONAL(50000, 12),
    VEHICLE(300000, 24),
    HOME(1000000, 360);

    private final double maxAmount;
    private final int maxInstallments;

    Destinatary(double maxAmount, int maxInstallments) {
        this.maxAmount = maxAmount;
        this.maxInstallments = maxInstallments;
    }

    public boolean isValid(double amount, int installments){
        return amount < maxAmount && installments < maxInstallments;
    }


}
