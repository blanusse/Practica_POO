package Practicas.practica3.ej7;

public class BankAccountTester {

    public static void main(String[] args) {
        CheckingAccount myCheckingAccount = new CheckingAccount(1001, 50);
        myCheckingAccount.deposit(100.0);
        System.out.println(myCheckingAccount);
        myCheckingAccount.extract(150.0);
        System.out.println(myCheckingAccount);

        SavingsAccount mySavingsAccount = new SavingsAccount(1002);
        mySavingsAccount.deposit(100.0);
        System.out.println(mySavingsAccount);
        mySavingsAccount.extract(150.0); // No se realiza por falta de fondos
        System.out.println(mySavingsAccount);

        BankAccount myBankAccount = new SavingsAccount(1002);
        System.out.println(myBankAccount.getClass());
        //class Practicas.practica3.ej7.SavingsAccount

//        BankAccount myBankAccount = new CheckingAccount(1002, 50);
//        System.out.println(myBankAccount.getOverdraft()); //falla

        // el correcto seria:
        //BankAccount myBankAccount = new CheckingAccount(1002, 50);
        //System.out.println((CheckingAccount)myBankAccount.getOverdraft());
    }

    //a) No se podria porque no se puede

    //b) Si se puede y el codigo funciona porque siempre se pone al padre a la izq y ademas la clase SavingsAccount
    //      hereda tod.o de BankAccount

    //c) No se puede y no corre el codigo

    //d) Devuelve class Practicas.practica3.ej7.SavingsAccount porque el getClass devuelve el lugar de la clase myBankAccount

    //e) falla poruqe la variable es de tipo BankAccount y esa clase no tiene el metodo getOverdraft()

    //f) Habria que castear a CheckingAccount la variable

}