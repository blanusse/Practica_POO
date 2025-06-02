package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_2Q.ej1;

public enum EventType implements Comparable<EventType>{
    COMMENT("COMMENT"),SUGGESTION("SUGGESTION"), DOWNLOAD("DOWNLOAD");


    public String name;
    EventType(String name){
        this.name = name;
    }

    public String toString(){
        return "%s Event".formatted(name);
    }
}
