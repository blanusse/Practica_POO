package ParcialesViejos.Primeros.Q2_2022.ejercicio2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class StockInventory implements Iterable<StockResult>{
    private StockResult[] inventory;
    private int size;
    private final static int INITIAL_DIM = 10;
    private Predicate<Integer> predicate;

    public StockInventory(){
        inventory = new StockResult[INITIAL_DIM];
        predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer stock) {
                return stock<=1;
            }
        };
        size = 0;
    }

    private void resize(){
        if(size % INITIAL_DIM == 0){
            inventory = Arrays.copyOf(inventory, size+INITIAL_DIM);
        }
    }

    public void add(String name, int quantity){
        resize();
        inventory[size++] = new StockResult(name, quantity, predicate);
    }

    public void setMinimumStock(Predicate<Integer> minimumStock) {
        this.predicate = minimumStock;
    }

    public void reduceStock(String name){
        for(int i=0; i<size; i++){
            if(inventory[i].getProduct().equals(name)){
                if(inventory[i].getStock() == 0){
                    throw new RuntimeException("No stock to reduce");
                }
                inventory[i].reduceStock();
                return;
            }
        }
        throw new RuntimeException("No product found with name %s".formatted(name));
    }



    @Override
    public Iterator<StockResult> iterator(){
        return new Iterator<>() {
            int current = 0;
            Predicate<Integer> currentPred = predicate;
            @Override
            public boolean hasNext() {
                return current < size;
            }

            @Override
            public StockResult next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                StockResult toReturn = inventory[current++];
                toReturn.setStockAlert(currentPred);
                return toReturn;

            }
        };
    }

}
