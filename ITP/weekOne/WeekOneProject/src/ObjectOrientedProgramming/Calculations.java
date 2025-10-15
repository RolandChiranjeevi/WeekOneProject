package ObjectOrientedProgramming;
// Vår main-metod för att kunna anropa från metoden
// calculations som finns i vår Calculatorklass.

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner myScanner =  new Scanner(System.in);
        System.out.print("Skriv in ett tal: ");
        int inputA = myScanner.nextInt();
        System.out.print("Skriv in ett till tal: ");
        int inputB = myScanner.nextInt();
        Calculator calc = new Calculator(inputA,inputB);
        //Calculator cal2 = new Calculator(5,6);
        //Calculator secondNumber = new Calculator(3.5,4.5);
        //Calculator thirdNumber = new Calculator(5,5);

        //int summa = calc.addition();
        //int summa1 = calc.subtraction();
        //int summa2 = calc.timesEachOther();
        //double summa3 = calc.divided();
        //int summa2 = cal2.calculations();
        System.out.println("Summan av dessa tal adderat blir : "+ calc.divided());
        System.out.println("Summan av dessa tal adderat blir : "+ calc.subtraction());
        System.out.println("Summan av dessa tal adderat blir : "+ calc.timesEachOther());
        System.out.println("Summan av dessa tal adderat blir : "+ calc.addition());
        //System.out.println("Summan är "+summa2);

        //firstNumber.calculations();
        //secondNumber.calculations();5
        //thirdNumber.calculations();
    }
}
