package Taller.Taller4.ej4;

//public class PhoneNumber implements Comparable<PhoneNumber> {
//    private int areaCode;
//    private int prefix;
//    private int lineNumber;
//
//    @Override
//    public int compareTo(PhoneNumber o) {
//        int result = Integer.compare(this.areaCode, o.areaCode); //this.areaCode - o.areaCode
//        if(result == 0){
//            result = Integer.compare(this.prefix, o.prefix);
//        }
//        if(result == 0) {
//            result = Integer.compare(this.lineNumber, o.lineNumber);
//        }
//        return result;
//    }
//
//
//    public int getAreaCode(){
//        return this.areaCode;
//    }
//
//    public int getPrefix(){
//        return this.prefix;
//    }
//
//    public int getLineNumber(){
//        return this.lineNumber;
//    }
//
//    public PhoneNumber(int prefix, int areaCode, int lineNumber) {
//        this.prefix = prefix;
//        this.areaCode = areaCode;
//        this.lineNumber = lineNumber;
//    }
//
////    @Override
////    public String toString(){
////        return "%s, %s, %s".formatted(this.areaCode, this.prefix, this.lineNumber);
////    }
//
//}



public class PhoneNumber implements Comparable<PhoneNumber>{

    private int areaCode, prefix, lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int cmp = Integer.compare(areaCode, o.areaCode);
        if(cmp == 0) {
            cmp = Integer.compare(prefix, o.prefix);
            if(cmp == 0) {
                cmp = Integer.compare(lineNumber, o.lineNumber);
            }
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "areaCode=" + areaCode + ", prefix=" + prefix + ", lineNumber=" + lineNumber + '}';
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getPrefix() {
        return prefix;
    }

}





