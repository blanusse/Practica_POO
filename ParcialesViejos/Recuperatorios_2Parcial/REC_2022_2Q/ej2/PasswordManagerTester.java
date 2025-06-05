package ParcialesViejos.Recuperatorios_2Parcial.REC_2022_2Q.ej2;

public class PasswordManagerTester {
   public static void main(String[] args) {
       // Se instancia un gestor de contraseñas. Se inicia sin bóvedas.
       PasswordManager passwordManager = new PasswordManager();


       // Agrega la bóveda "Personal" con la política de contraseñas None.
       // Si ya existe una bóveda con ese nombre no hace nada.
       passwordManager.addVault("Personal", Types.NONE);


       // Agrega en la bóveda "Personal" el sitio web "itba.edu.ar" con su contraseña "qwerty".
       // Si ya existe una contraseña para el sitio en la bóveda, la actualiza.
       passwordManager.addPassword("Personal", "itba.edu.ar", "qwerty");


       passwordManager.addPassword("Personal", "google.com", "123");


       // Obtiene la contraseña a partir de la bóveda y el sitio web
       System.out.println(passwordManager.getPassword("Personal", "itba.edu.ar")); // qwerty


       try {
           // Si la bóveda no existe se arroja un error
           passwordManager.addPassword("Work", "github.com", "123");
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // Invalid Vault
       }


       try {
           // Si la bóveda no existe o no se agregó el sitio web a la bóveda se arroja un error
           System.out.println(passwordManager.getPassword("Personal", "github.com"));
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // Nonexistent website in vault
       }


       // Agrega una bóveda "Work" con la política de contraseñas Level1.
       passwordManager.addVault("Work", Types.LEVEL1);


       try {
           // Si la contraseña no cumple con la política de la bóveda se arroja un error
           passwordManager.addPassword("Work", "github.com", "123");
       } catch (Exception ex) {
           System.out.println(ex.getMessage()); // Password does not comply vault policy.
       }


       passwordManager.addPassword("Work", "github.com", "123456");
       passwordManager.addPassword("Work", "bitbucket.com", "qwerty");


       // Actualiza la política de contraseñas de la bóveda "Work" a Level2
       // Si la bóveda no existe se arroja un error
       passwordManager.changeVaultPolicy("Work", Types.LEVEL2);


       // Obtiene todos los sitios web de la bóveda "Work" que tengan contraseñas
       // que no cumplan con la política (producto de las contraseñas agregadas
       // con una política anterior) en orden alfabético por sitio web
       // Si no hay contraseñas que no cumplan retorna una colección vacía
       for(String invalidWebsites : passwordManager.getInvalidPasswords("Work")) {
           System.out.println(invalidWebsites);
       }
       // bitbucket.com
       // github.com


       passwordManager.changeVaultPolicy("Personal", Types.LEVEL1);


       // Obtiene todos los sitios web que tengan contraseñas que no cumplan
       // con la política de la bóveda correspondiente (producto de las contraseñas agregadas
       // con una política anterior) en orden alfabético por bóveda y
       // desempata alfabético por sitio web
       // Si no hay contraseñas que no cumplan retorna una colección vacía
       for(String invalidWebsites : passwordManager.getInvalidPasswords()) {
           System.out.println(invalidWebsites);
       }
       // google.com
       // bitbucket.com
       // github.com
   }
}

