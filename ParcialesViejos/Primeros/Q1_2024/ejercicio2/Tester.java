package ParcialesViejos.Primeros.Q1_2024.ejercicio2;

public class Tester {
    public static void main(String[] args) throws InvalidPaymentPlanException{
// Se instancia un plan de pagos de hasta 12 cuotas sin bonificaciones
// para $3.000,00 en 3 cuotas
        PaymentPlan pp1 = new PaymentPlan(PlanType.STANDARD,3000, 3);
// Se consulta el detalle de la siguiente cuota con next
        System.out.println(pp1.next()); // $1000,00 due for installment 1
        System.out.println(pp1.next()); // $1000,00 due for installment 2
        System.out.println(pp1.next()); // $1000,00 due for installment 3
        try { // Falla porque ya se consultaron todas las cuotas con next
            pp1.next();
        } catch (Exception ex) {
            System.out.println("No more installments"); // No more installments
        }
// Se instancia un plan de pagos de hasta 24 cuotas con las 3 primeras gratis
// para $5.000,00 en 5 cuotas
        PaymentPlan pp2 = new PaymentPlan(PlanType.FREE_FIRST_THREE,5000, 5);
// Se consulta el detalle de la siguiente cuota con peek
        System.out.println(pp2.peek()); // $0,00 due for installment 1
        System.out.println(pp2.next()); // $0,00 due for installment 1
        System.out.println(pp2.next()); // $0,00 due for installment 2
        System.out.println(pp2.peek()); // $0,00 due for installment 3
        System.out.println(pp2.peek()); // $0,00 due for installment 3
        System.out.println(pp2.next()); // $0,00 due for installment 3
        System.out.println(pp2.next()); // $1000,00 due for installment 4
        System.out.println(pp2.next()); // $1000,00 due for installment 5
        try { // Falla porque ya se consultaron todas las cuotas con next
            pp2.peek();
        } catch (Exception ex) {
            System.out.println("No more installments"); // No more installments
        }
        // Se instancia un plan de pagos de hasta 360 cuotas con las pares al 50%
// para $6.000,00 en 5 cuotas
        PaymentPlan pp3 = new PaymentPlan(PlanType.HALF_ALL_EVEN,6000, 5);
        while(pp3.hasNext()) {
            System.out.println(pp3.next());
        }
// $1200,00 due for installment 1
// $600,00 due for installment 2
// $1200,00 due for installment 3
// $600,00 due for installment 4
// $1200,00 due for installment 5
        try { // Falla pues la cantidad de cuotas supera el máximo permitido
            new PaymentPlan(PlanType.STANDARD ,3000, 13);
        } catch (InvalidPaymentPlanException ex) {
            System.out.println(ex.getMessage()); // Invalid payment plan
        }
        try { // Falla pues la cantidad de cuotas no es positiva
            new PaymentPlan(PlanType.STANDARD ,3000, -2);

        } catch (InvalidPaymentPlanException ex) {
            System.out.println(ex.getMessage()); // Invalid payment plan
        }
        try { // Falla pues el monto no es positivo
            new PaymentPlan(PlanType.STANDARD ,0, 12);
        } catch (InvalidPaymentPlanException ex) {
            System.out.println(ex.getMessage()); // Invalid payment plan
        }
    }
}
