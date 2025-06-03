package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_2Q.ej1;

public class UndoCollectionTester {
   public static void main(String[] args) {
       UndoCollection<String> uC = new UndoCollectionImpl<>();
       System.out.println(uC.isEmpty()); // true
       System.out.println(uC.add("hola")); // true
       System.out.println(uC.add("hola")); // false
       System.out.println(uC.add("que paso?")); // true
       System.out.println(uC.add("mundo")); // true
       System.out.println(uC.add("chau")); // true
       System.out.println(uC.size()); // 4
       System.out.println(uC.contains("chau")); // true


       uC.undo(); // Realiza un undo


       System.out.println(uC.size()); // 3
       System.out.println(uC.contains("chau")); // false


       System.out.println(uC.undo(2)); // 2 // Realiza dos undo seguidos


       System.out.println(uC.contains("mundo")); // false
       System.out.println(uC.contains("que paso?")); // false
       System.out.println(uC.contains("hola")); // true
       System.out.println(uC.size()); // 1
       System.out.println(uC.add("hello")); // true
       System.out.println(uC.contains("hello")); // true
       System.out.println(uC.size()); // 2


       uC.undo();


       System.out.println(uC.contains("hello")); // false
       System.out.println(uC.contains("hola")); // true


       uC.undo();


       System.out.println(uC.contains("hola")); // false


       try {
           uC.undo();
       } catch (NothingToUndoException ex) {
           System.out.println(ex.getMessage()); // Nothing to undo
       }
       System.out.println(uC.undo(1)); // 0
   }
}

