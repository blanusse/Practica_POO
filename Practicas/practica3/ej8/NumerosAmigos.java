package Practicas.practica3.ej8;

public class NumerosAmigos extends CellPhoneBill{
    private int promotionPrice;
    private static final int PROMOTION_INITIAL_COST = 0;

    private int friendsLimit;
    private int actualFriends;

    protected String[] friendsNumbers;


    public NumerosAmigos(String number, int limit) {
        super(number);
        this.friendsLimit = limit;
        this.actualFriends = 0;
        this.friendsNumbers = new String[limit];
        this.promotionPrice = PROMOTION_INITIAL_COST;
    }

    public void setPrice(int price){
        this.promotionPrice = price;
    }

    public void addFriend(String num){
        if(actualFriends < friendsLimit) {
            friendsNumbers[actualFriends] = num;
            actualFriends++;

        }
        else{
            System.out.println("No se pueden agregar mas amigos");
        }
    }

    public boolean isFriend(String num){
        for(int i=0; i<actualFriends; i++){
            if(this.friendsNumbers[i].compareTo(num) == 0){
                return true;
            }
        }
        return false;
    }

    public void removeFriend(String num) {
        int i=0;
        boolean found = false;
        for (; i < actualFriends && !found; i++) {
            if (this.friendsNumbers[i].compareTo(num) == 0) {
                found = true;
                friendsNumbers[i] = friendsNumbers[--actualFriends]; //pone el ultimo amigo donde se borro este
            }
        }
    }
@Override
    public double processBill(){
        double total = 0;
        for(int i=0; i<callsIndex; i++){
            if(isFriend(calls[i].getFrom())){
                total += calls[i].getCost() * this.promotionPrice;
            }
            else{
                total += calls[i].getCost();
            }
        }
        return total;
    }

}
