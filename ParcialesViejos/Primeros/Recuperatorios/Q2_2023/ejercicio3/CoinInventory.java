package ParcialesViejos.Primeros.Recuperatorios.Q2_2023.ejercicio3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class CoinInventory {
    private Coin[] inventory;
    private final static int INITIAL_DIM = 10;
    private int size;

    public CoinInventory(){
        this.size = 0;
        this.inventory = new Coin[INITIAL_DIM];
    }

    private void resize(){
        if(size % INITIAL_DIM ==0){
            inventory = Arrays.copyOf(inventory, size+INITIAL_DIM);
        }
    }

    public CoinInventory addSilverCoin(String name, String country, int year){
        resize();
        inventory[size++] = new SilverCoin(name, country, year);
        return this;
    }

    public CoinInventory addGoldCoin(String name, String country, int year, int qil){
        resize();
        inventory[size++] = new GoldCoin(name, country, year, qil);
        return this;
    }

    private Coin[] orderCopy(Comparator<Coin> comparator){
        Coin[] toReturn = Arrays.copyOf(inventory, size);
        Arrays.sort(toReturn, comparator);
        return toReturn;
    }

    public Coin[] getMintDateCopy(){
        return orderCopy(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                int cmp = o2.getYear()-o1.getYear();
                if(cmp == 0){
                    cmp = o1.getCountry().compareTo(o2.getCountry());
                }
                return cmp;
            }
        });
    }

    public Coin[] getCountriesCopy(){
        return orderCopy(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                int cmp = o1.getCountry().compareTo(o2.getCountry());
                if(cmp == 0){
                    cmp = o2.getYear()-o1.getYear();
                }
                return cmp;
            }
        });
    }

    public Coin getFirstCoin(Predicate<Coin> predicate){
        for(int i=0; i<size; i++){
            if(predicate.test(inventory[i])){
                return inventory[i];
            }
        }
        throw new RuntimeException("No such Coin");
    }
}
