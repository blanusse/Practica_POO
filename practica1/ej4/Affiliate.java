package practica1.ej4;

//No esta bien hecho
public class Affiliate {
    private name;
    private String lastName;
    private int birthday;
    private int initialNum = 1000;
    private int lastNum;
    private int affNum;

    private int getAndIncrement(){
        int toRet = lastNum;
        lastNum++;
        return toRet;
    }
    public Affiliate(int n, int l, int b){
        name = n;
        lastName = l;
        birthday = b;
        affNum = getAndIncrement();
    }
    public int getAffNum(){
        return affNum;
    }
}
