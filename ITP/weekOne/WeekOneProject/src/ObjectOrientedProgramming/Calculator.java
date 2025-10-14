package ObjectOrientedProgramming;
/*
1.  Skapa en class Calculator som läser in två tal i 	konstruktorn och sparar dem som attribut
2.	Skapa en metod som skriver ut addition för 	dessa två tal. Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en 	main-metodPr
3.	Uppdatera din main-metod så att den läser in 	de två talen med Scanner
4.	Uppdatera Calculator så att den har liknande 	metoder för minus/delat med/gånger
 */

public class Calculator {
    private double numberOne;
    private double numberTwo;
    //private double calculation;

public Calculator(double numberOne, double numberTwo) {
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
    //this.calculation = calculation;
}
public void calculations () {
    double calculations = numberOne * numberTwo;
    System.out.println("The result of your calculation is "+calculations);

}
}
