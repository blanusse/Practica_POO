//package Teorica.Enums;
//
//public enum Operation {
//    PLUS("+"){
//        @Override
//        public double apply(double n1, double n2){
//            return n1 + n2;
//        }
//    },
//    SUBSTRACTION("-"){
//        @Override
//        public double apply(double n1, double n2){
//            return n1 - n2;
//        }
//    },
//    MULTIPLY("*"){
//        @Override
//        public double apply(double n1, double n2){
//            return n1 * n2;
//        }
//    },
//    DIVIDE("/"){
//        @Override
//        public double apply(double n1, double n2){
//            return n1 / n2;
//        }
//    };
//
//    private final String operator;
//
//    Operation(String op){
//        this.operator = op;
//    }
//
//    public abstract double apply(double n1, double n2);
//
//    public double evaluate(String n1, String n2, String op){
//        double num1 = Double.parseDouble(n1);
//        double num2 = Double.parseDouble(n2);
//        for(Operation instance: values()){
//            if(instance.operator.equals(op)){
//                return apply(num1, num2);
//            }
//        }
//
//
//    }
//
//
//
//}
