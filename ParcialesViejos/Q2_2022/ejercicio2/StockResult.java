package ParcialesViejos.Q2_2022.ejercicio2;

import java.util.function.Predicate;

public class StockResult extends StockProduct {
    private Predicate<Integer> stockAlert;



    public StockResult(String product, int stock, Predicate<Integer> stockAlert) {
        super(product, stock);
        setStockAlert(stockAlert);
    }

    public void setStockAlert(Predicate<Integer> stockAlert){
        this.stockAlert = stockAlert;
    }

    @Override
    public String toString() {
        return String.format("%s < > %s", super.toString(), stockAlert.test(getStock()) ? "Low Stock!" : "Stock OK");
    }
}
