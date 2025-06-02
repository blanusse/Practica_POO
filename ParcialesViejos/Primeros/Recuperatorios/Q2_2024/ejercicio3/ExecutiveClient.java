package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio3;

public class ExecutiveClient extends Client{
    private int maxBooks;

    public ExecutiveClient(String name, int maxBooks){
        super(name);
        this.maxBooks = maxBooks;
    }

    @Override
    public void bookRoom(RoomType type, int guests, int nights){
        if(this.getBooks() >= maxBooks ){
            throw new CannotBookException();
        }
        super.bookRoom(type, guests, nights);
    }


}
