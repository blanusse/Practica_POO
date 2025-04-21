package Teorica.Generics;

import java.util.Comparator;
import java.util.function.Function;

public class Date{

    private final int day, month, year;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int getYear(){
        return this.year;
    }

    int getDay(){
        return this.day;
    }

    int getMonth(){
        return this.month;
    }



    @Override
    public String toString(){
        return "%d/%d/%d".formatted(day, month, year);
    }

//    @Override
//    public int compareTo(Date o) {
//        int toRet = Integer.compare(this.year, o.year);
//        if(toRet == 0){
//            toRet = Integer.compare(this.month, o.month);
//        }
//        if(toRet == 0){
//            toRet = Integer.compare(this.day, o.day);
//        }
//        return toRet;
//    }


    public static void main(String[] args){
        Date d1 = new Date(1, 1, 2020);
        Date d2 = new Date(1, 2, 2020);
        Date d3 = new Date(10, 1, 2020);

        Comparator<Date> ddo = new DateDescendingOrder();
        System.out.println(ddo.compare(d1, d2));
        System.out.println(ddo.compare(d2, d1));



    }
}