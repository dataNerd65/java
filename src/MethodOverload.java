//Demonstrating use of method overloading in java
//below using two methods is x and y but e and are utilising one which is plusMethod.
public class MethodOverload {
    static int plusMethod(int e, int d){
        return e + d;
    }
    static double plusMethod(double e, double d){
        return  e + d;
    }
    static int plusMethodInt(int x, int y){
        return x + y;

    }
    static double plusMethodDouble(double x, double y){
        return x + y;

    }
    public static void main(String[] args){
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);

        System.out.println("Int In 2Methods style: " + myNum1);
        System.out.println("Double In 2Methods style: " + myNum2);

        int myNum3 = plusMethod(56, 78);
        double myNum4 = plusMethod(56.7, 78.4);

        System.out.println("Int in MethodOverload " + myNum3);
        System.out.println("Double in MethodOverload " + myNum4);
    }

}
