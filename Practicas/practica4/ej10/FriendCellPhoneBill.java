package Practicas.practica4.ej10;

public class FriendCellPhoneBill extends CellPhoneBill {
    private int promotionPrice;
    private static final int PROMOTION_INITIAL_COST = 0;

    private int friendsLimit;
    private int actualFriends;

    protected String[] friendsNumbers;


    public FriendCellPhoneBill(String number, int limit) {
        super(number);
        this.friendsLimit = limit;
        this.actualFriends = 0;
        this.friendsNumbers = new String[limit];
        this.promotionPrice = PROMOTION_INITIAL_COST;
    }

    public void setCost(int price){
        this.promotionPrice = price;
    }

    public void addFriend(String num) throws TooManyFriendsException, AlreadyExistsFriendException {
        if(isFriend(num)){
            throw new AlreadyExistsFriendException(num);
        }
        if(actualFriends < friendsLimit) {
            friendsNumbers[actualFriends] = num;
            actualFriends++;
        }
        else{
            throw new TooManyFriendsException(num);
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

    public void removeFriend(String num) throws FriendNotFoundException {
        int i=0;
        boolean found = false;
        for (; i < actualFriends && !found; i++) {
            if (this.friendsNumbers[i].compareTo(num) == 0) {
                found = true;
                friendsNumbers[i] = friendsNumbers[--actualFriends]; //pone el ultimo amigo donde se borro este
            }
        }
        throw new FriendNotFoundException(num);
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
