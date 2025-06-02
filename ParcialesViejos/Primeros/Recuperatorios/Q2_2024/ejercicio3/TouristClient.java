package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio3;

public class TouristClient extends Client{
    private int maxAmount;
    private int amount;


    public TouristClient(String name, int maxAmount){
        super(name);
        this.maxAmount = maxAmount;
        this.amount = 0;
    }

    @Override
    public void bookRoom(RoomType type, int guests, int nights){
        if(amount+type.getPrice(nights) > maxAmount ){
            throw new CannotBookException();
        }
        super.bookRoom(type, guests, nights);
        this.amount += type.getPrice(nights);
    }




}
