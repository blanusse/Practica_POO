package Taller.Taller4.ej4;

import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberMain {
    public static void main(String[] args) {
        PhoneNumber[] phoneNumbers = new PhoneNumber[]{
                new PhoneNumber(12, 1234, 12312512),
                new PhoneNumber(12, 235234, 12312512),
                new PhoneNumber(12, 1234, 453490)
        };

        Arrays.sort(phoneNumbers); //usa el compareTo implementado en PhoneNumber
        System.out.println(Arrays.toString(phoneNumbers)); //lo imprime


        Arrays.sort(phoneNumbers, Comparator.naturalOrder());//lo ordena en orden natural (es lo mismo que arriba)
        System.out.println(Arrays.toString(phoneNumbers)); //lo imprime

        Arrays.sort(phoneNumbers, Comparator.reverseOrder()); //lo ordena al reves
        System.out.println(Arrays.toString(phoneNumbers)); //lo imprime


        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() { //elijo como quiero que sea el nuevo orden, implementandola arriba
            //ESTO ES UNA CLASE ANONIMA Y EN JAVA CASI QUE NO SE USA MAS
            //es lo mismo que implementar una clase nueva que se llama AscendingPhoneNumberComparator
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                int result = Integer.compare(o1.getPrefix(), o2.getPrefix());
                if (result == 0) {
                    result = Integer.compare(o1.getAreaCode(), o2.getAreaCode());
                }
                if (result == 0) {
                    result = Integer.compare(o1.getLineNumber(), o2.getLineNumber());
                }
                return result;
            }
        });
        System.out.println(Arrays.toString(phoneNumbers)); //lo imprime

    }
}

