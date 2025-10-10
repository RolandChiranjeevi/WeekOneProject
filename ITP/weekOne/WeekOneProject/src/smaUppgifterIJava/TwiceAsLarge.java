package smaUppgifterIJava;

public class TwiceAsLarge {
    public static void main(String[] args) {
        int firstNumber=30;
        int secondNumber=15;
        int twiceAsLarge=firstNumber*2;
        if (secondNumber<twiceAsLarge)
        System.out.println("The first number, "+firstNumber+" is twice the size as the second number, "+secondNumber);
        else if (secondNumber>twiceAsLarge) {
            System.out.println("This first number, "+firstNumber+" is not twice the size of the second number, "+secondNumber);
        }
        System.out.println("This should work fine, I hope!");
    }
}


//   int firstNumber = 12;
//        int secondNumber = 15;
//        if (firstNumber>secondNumber) System.out.println(firstNumber);
//        else if (firstNumber<secondNumber) {
//            System.out.println("The number is not larger than the other!");
//
//        }