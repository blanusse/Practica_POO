package ParcialesViejos.Primeros.Recuperatorios.Q2_2022.ejercicio3;

import java.util.Arrays;

public class AllAccessPass{
    private String name;
    private FootballMatch[] record;
    private int recordSize;
    private final static int INITIAL_DIM = 10;
    private FootballCentral central;

    public AllAccessPass(FootballCentral central, String name){
        this.central = central;
        this.name = name;
        this.recordSize = 0;
        this.record = new FootballMatch[INITIAL_DIM];
    }

    private void resize(){
        if(this.recordSize % INITIAL_DIM ==0){
            record = Arrays.copyOf(record, this.recordSize + INITIAL_DIM);
        }
    }

    private boolean hasUsed(FootballMatch match){
        for(int i=0; i<recordSize; i++){
            if(record[i].equals(match)){
                return true;
            }
        }
        return false;
    }

    protected boolean canVisit(FootballMatch match){
        return central.belongsIn(match) && !hasUsed(match);
    }

    public void visit(FootballMatch match){
        if(!canVisit(match)){
            throw new RuntimeException("Invalid Match");
        }
        resize();
        record[recordSize++] = match;

    }


    @Override
    public String toString(){
        return "Football pass for %s used for %d matches %s".formatted(name, recordSize, Arrays.toString(Arrays.copyOf(record, recordSize)));
    }

}
