package Teorica.Interace;

public interface ObjectToCSV {
    String[] toCSV();

    default int length(){
        return toCSV().length;
    }

    default String emptyLine(){
        return "/n";
    }
    
}
