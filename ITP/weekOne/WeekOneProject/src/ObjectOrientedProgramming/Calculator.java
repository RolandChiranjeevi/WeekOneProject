package ObjectOrientedProgramming;
/*
1.  Skapa en class Calculator som läser in två tal i konstruktorn och sparar dem som attribut
2.	Skapa en metod som skriver ut addition för 	dessa två tal. Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en 	main-metodPr
3.	Uppdatera din main-metod så att den läser in de två talen med Scanner
4.	Uppdatera Calculator så att den har liknande metoder för minus/delat med/gånger
 */

public class Calculator {
    int numberOne,numberTwo;
    //private double numberTwo;
    //private double calculation;


    // Konstruktorn som ska läsa in våran class.
public Calculator(int numberOne, int numberTwo) {
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
    //this.calculation = calculation;
}

public int addition() {
    int summa = numberOne + numberTwo;
    return summa;
}

public int subtraction(){
    return numberOne-numberTwo;
}

public double divided() {
    return (double) numberOne/numberTwo;
    }
public int timesEachOther(){
    return numberOne*numberTwo;
}
}
