package ParcialesViejos.Primeros.Q2_2021.ejercicio1;

public class MatchElement<T>{
    private T element;
    private boolean hasMatch;

    public MatchElement(T element){
        this.element = element;
        this.hasMatch = false;
    }

    public T getElement() {
        return element;
    }

    public void match(){
        hasMatch = true;
    }

    public boolean matches(){
        return hasMatch;
    }


    @Override
    public String toString(){
        return "### %s : %s".formatted(element, hasMatch ? "Match" : "No Match");
    }
}
