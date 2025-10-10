package smaUppgifterIJava;

public class DivideEven {
    public static void main(String[] args) {
    int firstNumber = 30;
    int dividedNumber = 15;
    int moduloOperator = firstNumber%dividedNumber;
        System.out.println(moduloOperator);
    method2(firstNumber,dividedNumber,moduloOperator);
    }

    public static void method2(int first, int second, int third) {
    if (third==0) System.out.println("The number is evenly dividable!");
    else if (third!=0) {
        System.out.println("The number is not evenly dividable!");

    }
    }
}
