package ParcialesViejos.Q1_2021.ejercicio1;

public class Item implements Comparable<Item>{
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Item o){
        int cmp = (int)(this.price-o.price);
        if(cmp ==0){
            cmp = this.name.compareTo(o.name);
        }
        return cmp;
    }

    @Override
    public String toString(){
        return "%s >> $%.2f".formatted(name, price);
    }

}