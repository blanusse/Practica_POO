package ParcialesViejos.Recuperatorios_2Parcial.REC_2021_1Q.ej2;

public class ReddyTester {

   public static void main(String[] args) {
       User user1 = new User("bostero_12");
       User user2 = new User("nevermind");
       User user3 = new User("spacex");

       Reddy reddy = new Reddy();

       // Se agrega el comentario "Go SpaceX!" con "spacex" como autor en el grupo "bestCompanies"
       reddy.publishComment("bestCompanies", user3, "Go SpaceX!");
       System.out.println("-----");

       // Se agregan cinco comentarios más
       reddy.publishComment("bestCompanies", user2, "Google is the best");
       System.out.println("-----");
       reddy.publishComment("trading", user1, "We all should move to crypto");
       System.out.println("-----");
       reddy.publishComment("trading", user1, "Like, seriously, invest in crypto.");
       System.out.println("-----");
       reddy.publishComment("trading", user2, "Let's keep buying GameStop stock!");
       System.out.println("-----");
       reddy.publishComment("trading", user3, "Go SpaceX!");
       System.out.println("-----");

       System.out.println(String.format("*** All comments from user %s ***", user3));
       for (String comment : reddy.getAllCommentsFromUser(user3)) {
           System.out.println(comment);
       }
       System.out.println("-----");

       user1 = new User("bostero_12");
       System.out.println(String.format("*** All comments from user %s in group %s ***", user1, "trading"));
       for (String comment : reddy.getAllCommentsFromUserInGroup("trading", user1)) {
           System.out.println(comment);
       }
       System.out.println("-----");

       System.out.println(String.format("*** All comments in group %s ***", "bestCompanies"));
       for (String comment : reddy.getAllCommentsInGroup("bestCompanies")) {
           System.out.println(comment);
       }
       System.out.println("-----");

       // Se eliminan todos los comentarios del usuario "spacex" en el grupo "bestCompanies".
       reddy.deleteAllComments("bestCompanies", new User("spacex"));
       System.out.println("-----");

       System.out.println(String.format("*** All comments in group %s ***", "bestCompanies"));
       for (String comment : reddy.getAllCommentsInGroup("bestCompanies")) {
           System.out.println(comment);
       }
       System.out.println("-----");

       System.out.println(reddy.getAllCommentsFromUser(new User("user4")).isEmpty());
       System.out.println(reddy.getAllCommentsFromUserInGroup("hello", new User("user4")).isEmpty());
       System.out.println(reddy.getAllCommentsInGroup("hello").isEmpty());
       System.out.println("-----");

       try {
           // Se intenta eliminar todos los comentarios del usuario "spacex" en el grupo "hello".
           reddy.deleteAllComments("hello", new User("spacex"));
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // Falla pues no existe el grupo "hello".
       }
       System.out.println("-----");

       try {
           // Se intenta eliminar todos los comentarios del usuario "bostero_12" en el grupo "bestCompanies".
           reddy.deleteAllComments("bestCompanies", new User("bostero_12"));
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // Falla pues "bostero_12" nunca comentó en "bestCompanies".
       }
       System.out.println("-----");
   }

}

