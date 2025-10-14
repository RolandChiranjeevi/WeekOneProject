package ObjectOrientedProgramming;

public class Calculations {
    public static void main(String[] args) {
        Calculator firstNumber = new Calculator(2.5,3.76);
        Calculator secondNumber = new Calculator(3.5,4.5);

        firstNumber.calculations();
        secondNumber.calculations();
        }
}
