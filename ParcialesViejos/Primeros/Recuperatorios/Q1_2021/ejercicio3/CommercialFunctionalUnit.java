package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio3;

public class CommercialFunctionalUnit extends FunctionalUnit {


    public CommercialFunctionalUnit(Building building, String name, int sqmeters) {
        super(building, name, sqmeters);
    }

    @Override
    public double getAmount(){
        return super.getAmount()*this.getBuilding().getCommercialMult();
    }


    @Override
    public String toString(){
        return "Comercial: %s :%.2f".formatted(super.toString(), getAmount());
    }
}
