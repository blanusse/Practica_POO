package teorica;

public class DateTime extends Date {

    private  int hour;
    private  int minute;
    private  int seconds;

    public DateTime(int y, int m, int d, int h, int min, int sec) {
        super(y, m, d);
        this.hour = h;
        this.minute = min;
        this.seconds = sec;
    }
    public int getHour() {
        return hour;
    }

    //seria un polimorfismo con el print de teorica.Date
    public void print() {
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear() + " " + hour + ":" + minute + ":" + seconds);
    }

    public boolean isMorning() {
        return hour < 12;
    }
    public static DateTime now() {
        return new DateTime(2025, 3, 5, 13 ,0, 0);
    }
    public static String test(){
        return "Hola Mundo";
    }
}
