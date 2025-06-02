package ParcialesViejos.Segundos.Q1_2022.ej2;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class DriverLicenseCentral extends HashMap<String, Driver> {

    public void register(String name, int points){
        this.putIfAbsent(name, new Driver(points));
    }

    protected void checkDriver(String name){
        if(!this.containsKey(name)){
            throw new IllegalArgumentException("Driver does not exists");
        }
    }

    public int points(String name){
        checkDriver(name);
        return this.get(name).getPoints();
    }

    protected void checkInfraction(String name, LocalDate date){
        if(this.get(name).getInfractionsByDate().containsKey(date)){
            throw new IllegalArgumentException("Infraction already exists for driver and date");
        }
    }

    public void infraction(String name, LocalDate date, Infraction infraction){
        checkDriver(name);
        checkInfraction(name, date);
        this.get(name).getInfractionsByDate().put(date, infraction);
        this.get(name).takePoints(infraction.getPoints());
    }

    public Set<LocalDate> getInfractionDates(String name){
        checkDriver(name);
        return this.get(name).getInfractionsByDate().keySet();
    }

    public Collection<Infraction> getInfractionTypes(String name){
        checkDriver(name);

        return this.get(name).getInfractionsByDate().values();
    }
}
