package ParcialesViejos.Primeros.Recuperatorios.Q2_2021.ejercicio1;

public class MatchElement<T> {
    private boolean hasMatch;
    private T element;

    public MatchElement(T element){
        this.element = element;
        this.hasMatch = false;
    }

    public boolean matches(){
        return hasMatch;
    }

    public void setHasMatch(){
        this.hasMatch = true;
    }

    @Override
    public String toString(){
        return "### %s : %s ###".formatted(element, hasMatch ? "Match" : "No Match");
    }
}
