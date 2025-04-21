package ParcialesViejos.Q2_2023.ejericio1;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot> {
    private String name;
    private LocalTime openTime, closeTime;
    private long interval;

    public ParkRide(String name, LocalTime openTime, LocalTime closeTime, long interval) {
        if(interval <= 0) {
            throw new IllegalArgumentException("Slot minutes must be positive");
        }
        this.name = name;
        this.openTime = openTime;
        setCloseTime(closeTime);
        this.interval = interval;
    }


    public void setCloseTime(LocalTime newCloseTime){
        if(newCloseTime.isBefore(openTime)) {
            throw new IllegalArgumentException("Close time cannot be before open time");
        }
        closeTime = newCloseTime;
    }


    @Override
    public Iterator<ParkSlot> iterator() {
        return new Iterator<>() {
            LocalTime currentTime = openTime;
            LocalTime closeTimeIt = closeTime;

            @Override
            public boolean hasNext() {
                return currentTime.isBefore(closeTimeIt);
            }

            @Override
            public ParkSlot next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                ParkSlot toReturn = new ParkSlot(name, currentTime);
                currentTime = currentTime.plusMinutes(interval);
                return toReturn;

            }
        };
    }
}
