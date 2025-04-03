package Practicas.Practica2.ej5;

public class Palindromo {
    public static void main(String[] args){
        //Primero hay que poner todas las palabras en una frase
        String word = "";
        for(int i=0; i < args.length; i ++){
            word = word.concat(args[i]);
        }
        if(esPalindromo(word)){
            System.out.println("ES PALINDROMO");
        }
        else{
            System.out.println("NO ES PALINDROMO");
        }
    }

    private static boolean esPalindromo(String word){
        int lastLetter = word.length();
        for(int k=0; k < lastLetter/2; k++, lastLetter--){
            if(word.charAt(k) != word.charAt(lastLetter-1)){
                return false;
            }
        }
        return true;
    }
}
