package ParcialesViejos.Primeros.Recuperatorios.Q1_2021.ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Pifa {
    private Bill[] colection;
    private static final int INITIAL_DIM = 10;
    private int size;

    private final static int INITIAL_ID = 1001;
    private static int currentNumber = INITIAL_ID;


    public Pifa() {
        colection = new Bill[INITIAL_DIM];
        this.size = 0;
    }

    private void resize() {
        if (size % INITIAL_DIM == 0) {
            colection = Arrays.copyOf(colection, size + INITIAL_DIM);
        }
    }

    public void generateBill(String cuit, LocalDate date, double amount) {
        resize();
        System.out.println("Generating bill with id: %d".formatted(currentNumber));
        colection[size] = new Bill(cuit, date, amount);
        colection[size++].setID(currentNumber++);
    }

    private boolean canGet() {
        return size > 0;
    }

    public Bill[] getBills(Comparator<Bill> comp) {
        if (!canGet()) {
            throw new NoBillsException();
        }
        Bill[] toReturn = Arrays.copyOf(colection, size);
        Arrays.sort(toReturn, comp);
        return toReturn;
    }

    public Bill[] getBills() {
//        if (!canGet()) {
//            throw new NoBillsException();
//        }
        return getBills(null);
//        Bill[] toReturn = Arrays.copyOf(colection, size);
//        Arrays.sort(toReturn);
//        return toReturn;
    }
}
