package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio3;

public class Client {
    private String name;
    private int books;

    public Client(String name){
        this.name = name;
        this.books = 0;
    }

    public void bookRoom(RoomType type, int guests, int nights){
        if(!type.canBook(guests) || guests <= 0 || nights <= 0){
            throw new CannotBookException();
        }
        this.books++;
    }

    protected int getBooks(){
        return books;
    }


    @Override
    public String toString(){
        return "Client %s made %d books".formatted(name, books);
    }
}
