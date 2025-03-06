package teorica;

public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }


    public int getYear() {
        return year;
    }
    //seria un polimorfismo con el print de teorica.DateTime
    public void print(){
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public void setYear(int y) {
        year = y;
    }
    public void setMonth(int m) {}
}