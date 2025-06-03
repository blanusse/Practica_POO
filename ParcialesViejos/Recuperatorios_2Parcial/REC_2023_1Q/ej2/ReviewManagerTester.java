package ParcialesViejos.Recuperatorios_2Parcial.REC_2023_1Q.ej2;

public class ReviewManagerTester {


   public static void main(String[] args) {
       ReviewManager reviewManager = new ReviewManager();


       // Se agrega un usuario Foo de nivel BLACK que podrá dejar reseñas
       // de todos los productos
       reviewManager.addUser("Foo", UserLevel.BLACK);


       // Se agrega un usuario Bar de nivel GOLD que podrá dejar reseñas
       // de todos los productos que ya tengan al menos 1 reseña
       reviewManager.addUser("Bar", UserLevel.GOLD);


       // Se agrega un usuario Funko de nivel GREEN que podrá dejar reseñas
       // de todos los productos que ya tengan al menos 3 reseñas
       reviewManager.addUser("Funko", UserLevel.GREEN);


       // Se agrega una reseña del usuario Foo del producto iPhone
       reviewManager.addReview("Foo", "iPhone", "Great Product");


       reviewManager.addReview("Foo", "iPhone", "Again, great Product");
       reviewManager.addReview("Foo", "iMac", "The best desktop");


       try {
           // Falla porque requiere al menos 3 reseñas de iPhone y hay 2
           reviewManager.addReview("Funko", "iPhone", "I love it");
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // User cannot review
       }


       reviewManager.addReview("Bar", "iPhone", "Don't care");
       reviewManager.addReview("Funko", "iPhone", "I love it");


       try {
           // Falla porque requiere al menos 3 reseñas de iMac y hay 1
           reviewManager.addReview("Funko", "iMac", "I love it");
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // User cannot review
       }


       reviewManager.addReview("Bar", "iMac", "I prefer a laptop");


       // Se obtienen todas las reseñas del producto iPhone en orden de inserción
       for(String review : reviewManager.getReviews("iPhone")) {
           System.out.println(review);
       }
       /**
        * Great Product
        * Again, great Product
        * Don't care
        * I love it
        */


       // Se obtienen todos los productos con reseñas en orden alfabético
       for(String product : reviewManager.getProducts()) {
           System.out.println(product);
       }
       /**
        * iMac
        * iPhone
        */


       // Se obtienen todos los usuarios registrados en orden descendente
       for(String user : reviewManager.getUsers()) {
           System.out.println(user);
       }
       /**
        * Funko
        * Foo
        * Bar
        */


       try {
           // Falla porque el usuario Foo ya se encuentra registrado
           reviewManager.addUser("Foo", UserLevel.GOLD);
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // User already exists
       }


       try {
           // Falla porque el usuario John no está registrado
           reviewManager.addReview("John", "iPhone", "I can't review");
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // User does not exists
       }


       System.out.println(reviewManager.getReviews("AirPods").isEmpty()); // true


       System.out.println(new ReviewManager().getProducts().isEmpty()); // true


       System.out.println(new ReviewManager().getUsers().isEmpty()); // true
   }


}

