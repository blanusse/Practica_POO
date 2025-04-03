package Practicas.Practica2.ej3;

public class Deletrear {
    public static void main(String[] args){
        for(int i=0; i < args.length; i++){
            int k=0;
            for(; k < args[i].length()-1; k++){
                System.out.print(args[i].charAt(k) + "-");
            }
            System.out.print(args[i].charAt(k));

            System.out.println();
        }
    }

}
