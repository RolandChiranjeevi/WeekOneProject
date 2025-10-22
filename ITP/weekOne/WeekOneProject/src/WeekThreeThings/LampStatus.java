package WeekThreeThings;

import java.util.Scanner;

public class LampStatus {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Lampan lampan = new Lampan(false);
        System.out.println("Yo, would you like to turn this lamp on? ");
        System.out.print("Please type in yes or no! ");
        String status = myScanner.nextLine().toLowerCase();

        if (status.equals("yes")){
            System.out.println("Turning the lights on!");
            System.out.println("  \uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1");
            System.out.println(" \uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1");
            System.out.println("\uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1");
            System.out.println(" \uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1");
            System.out.println("  \uD83D\uDCA1\uD83D\uDCA1\uD83D\uDCA1");
            System.out.println("It's time to wake up!");
            lampan.turnOn();

        } else if (status.equals("no")){
            System.out.println("Turning the lights off!");
            System.out.println("  \uD83C\uDF19\uD83C\uDF19\uD83C\uDF19");
            System.out.println(" \uD83C\uDF19\uD83C\uDF19\uD83C\uDF19\uD83C\uDF19");
            System.out.println("\uD83C\uDF19\uD83C\uDF19\uD83C\uDF19\uD83C\uDF19\uD83C\uDF19");
            System.out.println(" \uD83C\uDF19\uD83C\uDF19\uD83C\uDF19\uD83C\uDF19");
            System.out.println("  \uD83C\uDF19\uD83C\uDF19\uD83C\uDF19");
            System.out.println("It's time to sleep!");
            lampan.turnOff();
            lampan.printStatus();
        } else {
            System.out.println("You probably didn't choose a correct value :)!");
        }


    }
}
