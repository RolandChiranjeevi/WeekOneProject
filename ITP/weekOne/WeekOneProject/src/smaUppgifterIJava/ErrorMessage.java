package smaUppgifterIJava;
//7.Skapa ett program som sparar två tal och dividerar det första talet med det andra
//talet. Om det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten
//skrivas ut.
public class ErrorMessage {
    public static void main(String[] args) {
        double numberOne = 10;
        double numberTwo = 0;

        if (numberTwo!=0){
            double finalCalculation = numberOne/numberTwo;
            System.out.printf("Your calculation is: %.2f\n",finalCalculation);
        } else {
            System.out.println("You cannot divide by 0!");
        }

    }
}
