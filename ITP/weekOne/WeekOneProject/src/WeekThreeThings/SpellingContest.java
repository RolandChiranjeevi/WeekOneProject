package WeekThreeThings;

import java.util.Scanner;

public class SpellingContest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(Spelling.getFirstQuestion());
        System.out.print("Type in your answer: ");
        String firstAnswer = myScanner.nextLine().toLowerCase();
        System.out.println(Spelling.getSecondQuestion());
        System.out.print("Type in your answer: ");
        String secondAnswer = myScanner.nextLine().toLowerCase();
        System.out.println(Spelling.getThirdQuestion());
        System.out.print("Type in your answer: ");
        String thirdAnswer = myScanner.nextLine().toLowerCase();
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");

        Spelling wordle = new Spelling(firstAnswer,secondAnswer,thirdAnswer,0);

        if (firstAnswer.equals(wordle.getFirstAnswer())) {
            System.out.println("It's correct! You get 1 point!");
            System.out.println("Correct answer is indeed: "+wordle.getFirstAnswer());
            System.out.println("");
            wordle.addPoints();
        } if(!firstAnswer.equals(wordle.getFirstAnswer())) {
            System.out.println("I'm sorry, but it's wrong. The correct answer is: "+wordle.getFirstAnswer());
            System.out.println("");
        } if (secondAnswer.equals(wordle.getSecondAnswer())) {
            System.out.println("It's correct! You get 1 point!");
            System.out.println("Correct answer is indeed: "+wordle.getSecondAnswer());
            System.out.println("");
            wordle.addPoints();
        } if(!secondAnswer.equals(wordle.getSecondAnswer())) {
            System.out.println("I'm sorry, but it's wrong. The correct answer is: "+wordle.getSecondAnswer());
            System.out.println("");
        } if (thirdAnswer.equals(wordle.getThirdAnswer())) {
            System.out.println("It's correct! You get 1 point");
            System.out.println("Correct answer is indeed: "+wordle.getThirdAnswer());
            System.out.println("");
            wordle.addPoints();
        } if (!thirdAnswer.equals(wordle.getThirdAnswer())) {
            System.out.println("I'm sorry, but it's wrong. The correct answer is: "+wordle.getThirdAnswer());
            System.out.println("");
        }

        System.out.println("The game is over and your total score is: "+wordle.getTotalPoints());


    }
}






/*Skapa ett rättstavningsprogram där man tävlar i att skriva ut rätt ord.
Användaren får ett ord skrivet på skärmen och skall sedan
repetera detta ordet på kommandoraden.
Skriver användaren rätt får den 1 poäng annars inget poäng.
Repetera detta för några ord (3 ord räcker som exempel)
och skriv sen ut totalt antal poäng.
När du skapar ditt program försök att lägga logiken samt
sparande av data i en class och låt classen med mainmetoden
enbart läsa in text och skriva ut resultatet.
 */