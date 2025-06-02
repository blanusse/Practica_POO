package ParcialesViejos.Primeros.PARCIAL_MIO.ejercicio2;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class DeparturesBoard{
  private LocalTime currentTime;
  private Departure[] board;
  private int size;
  private final static int INITIAL_DIM = 10;
 
//Constructor que recibe hora actual
  public DeparturesBoard(LocalTime currentTime){
      this.size = 0;
      setCurrentTime(currentTime);
      this.board = new Departure[INITIAL_DIM];
  }
 
//Setea la hora y se fija si alguno de las partidas ya registradas ha partido con el nuevo tiempo
  public void setCurrentTime(LocalTime newTime){
      this.currentTime = newTime;
      for(int i=0; i<size;i++){
          if(newTime.isAfter(board[i].getDate())){ //se fija con la nueva hora ya salio alguno
              board[i].setDeparture();
          }
      }
  }
//funcion por si hay que agrandar el tablero
  private void resize(){
    if(size % INITIAL_DIM == 0){
      this.board = Arrays.copyOf(this.board, size + INITIAL_DIM);
    }
  }
 
//Recorre el vector y revisa si no hay una partda igual, si lo hay devuelve false, sino agrega la partida
  public boolean addDeparture(LocalTime time, String destination, int platform){
      Departure newDep = new Departure(time, destination, platform);
      for(int i=0; i<size; i++){
        if(board[i].equals(newDep)){
              return false;
          }
      }
      board[size++] = newDep;
      return true;
  }
 
//Ordena una copia del tablero con el orden indicado
  private Departure[] orderBoardCopy(Comparator<Departure> comp){
    Departure[] toReturn = Arrays.copyOf(board ,size);
    Arrays.sort(toReturn, comp);
    return toReturn;
  }
 
//devuelve una copia del tablero con orden de insercion
    public Departure[] getDepartures(){
        return Arrays.copyOf(board, size);
    }
//devuelve una copia del tablero con orden indicado en el tester
     public Departure[] getDeparturesDescendingByPlatform(){
            return orderBoardCopy(Comparator.naturalOrder());
     }
//Devuelve una copia del tablero con orden indicado en el tester
     public Departure[] getDeparturesAscendingByPlatform(){
            return orderBoardCopy(Comparator.reverseOrder());
     }
 
 
    
}