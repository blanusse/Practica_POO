package ParcialesViejos.Q1_2024.ejercicio2;

public enum PlanType {
    STANDARD(12) {
        @Override
        public double apply(double installmentAmount, int installment) {
            return installmentAmount;
        }
    },
    FREE_FIRST_THREE(24) {
        @Override
        public double apply(double installmentAmount, int installment) {
            if(installment <= 3) {
                return 0;
            }
            return installmentAmount;
        }
    },

    HALF_ALL_EVEN(360) {
        @Override
        public double apply(double installmentAmount, int installment) {
            if(installment % 2 == 0) {
                return installmentAmount / 2;
            }
            return installmentAmount;
        }
    };
    private final int maxInstallments;
    PlanType(int maxInstallments) {
        this.maxInstallments = maxInstallments;
    }

    public boolean isValid(int installments) {
        return installments <= maxInstallments;
    }
    public abstract double apply(double installmentAmount, int installment);
    }
