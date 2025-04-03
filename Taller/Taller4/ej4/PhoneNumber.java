package Taller.Taller4.ej4;

public class PhoneNumber implements Comparable<PhoneNumber> {
    private int areaCode;
    private int prefix;
    private int lineNumber;

    @Override
    public int compareTo(PhoneNumber o) {
        int result = Integer.compare(this.areaCode, o.areaCode);
        if(result == 0){
            result = Integer.compare(this.prefix, o.prefix);
        }
        if(result == 0) {
            result = Integer.compare(this.lineNumber, o.lineNumber);
        }
        return result;
    }


    public PhoneNumber(int prefix, int areaCode, int lineNumber) {
        this.prefix = prefix;
        this.areaCode = areaCode;
        this.lineNumber = lineNumber;
    }
}





