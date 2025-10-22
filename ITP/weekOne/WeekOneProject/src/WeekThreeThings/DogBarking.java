package WeekThreeThings;

import java.util.Scanner;

public class DogBarking {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.print("How old is the dog? ");
        int dogYear = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("What is the name of your dog? ");
        String dogName = myScanner.nextLine();
        System.out.print("What kind of race is your dog? ");
        String dogRace = myScanner.nextLine();

        Dog dogOne = new Dog(dogYear,dogRace,dogName);

        System.out.println(dogOne.dogSaysWhat());
        System.out.println("Your dog is called - "+ dogOne.getDogName());
        System.out.println( dogOne.getDogName()+" is "+dogOne.getDogYear()+" years old!");
        System.out.println( dogOne.getDogName()+" is a "+dogOne.getDogRace());
        System.out.println(dogOne.getDogName()+" is "+dogOne.humanDogAge()+" years in human years!");
    }

}
