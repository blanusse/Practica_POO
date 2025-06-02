package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio2;

import java.time.LocalDate;

public class Bill implements Comparable<Bill>{
    private int id;
    private final String cuit;
    private final LocalDate date;
    private double amount;

    public Bill(String cuit, LocalDate date, double amount) {
        this.cuit = cuit;
        this.date = date;
        this.amount = amount;
    }

    protected void setID(int id){
        this.id  = id;
    }

    public int getId() {
        return id;
    }

    public String getCuit() {
        return cuit;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int compareTo(Bill o){
        int cmp = o.date.compareTo(this.date);
        if(cmp == 0){
            cmp = (int)(this.amount-o.amount);
        }
        return cmp;
    }


    @Override
    public String toString(){
        return "### Bill %d # Cuit %s # Date %s # Amount $%.2f ###".formatted(id, cuit, date, amount);
    }
}
