package ParcialesViejos.Primeros.Q1_2024.ejercicio1;

import java.time.LocalTime;

public class Puerto {
    private String name;
    private int mulles;
    private FerryCompany company;
    private int dockedFerries;


    public Puerto(String name, FerryCompany company,int muelles){
        this.name = name;
        this.mulles = muelles;
        this.company = company;
        this.dockedFerries = 0;
    }

    public boolean canDock(Ferry ferryName, LocalTime dockTime){
        return ferryName.getCompany().equals(company) && dockedFerries < mulles;
    }

    public void dock(Ferry ferryName, LocalTime dockTime){
        if(!canDock(ferryName, dockTime)){
            throw new RuntimeException();
        }
        dockedFerries++;
        print(ferryName, "docked");

    }


    public void undock(Ferry ferryName, LocalTime unDockTime){
        if(dockedFerries ==0){
            throw new RuntimeException();
        }
        dockedFerries--;
        print(ferryName, "undocked");
    }

    public void print(Ferry ferryName, String status){
        System.out.printf("%s %s at Port %s\n", ferryName, status, name);
    }

}
