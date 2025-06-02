package ParcialesViejos.Primeros.Recuperatorios.Q1_2022.ejercicio2;

import java.time.LocalDate;

public class Departure implements Comparable<Departure>{
    private String code;
    private LocalDate date;

    public Departure(String code, LocalDate date){
        this.code = code;
        this.date = date;
    }

    @Override
    public int compareTo(Departure o){
        int cmp = this.date.compareTo(o.date);
        if(cmp ==0 ){
            cmp = this.code.compareTo(o.code);
        }
        return cmp;
    }


    public String getCode() {
        return code;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString(){
        return "%s, %s".formatted(code, date);
    }


}
