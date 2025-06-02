package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio3;

public enum RoomType {
    SIMPLE(1, 1000),
    SUITE(4, 3000);

    private int capacity;
    private int price;

    RoomType(int capacity,  int price){
        this.capacity = capacity;
        this.price = price;
    }

    public boolean canBook(int guests){
        return guests<=this.capacity;
    }

    public int getPrice(int nights){
        return this.price * nights;
    }


}
