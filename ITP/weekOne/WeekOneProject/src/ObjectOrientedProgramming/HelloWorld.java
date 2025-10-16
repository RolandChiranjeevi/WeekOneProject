package ObjectOrientedProgramming;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
       Scanner myScanner = new Scanner(System.in);
       // HelloWorldEtt vahid = new HelloWorldEtt();
        HelloWorldEtt david = new HelloWorldEtt("Hej ");
        System.out.print("Pick a number: ");
        String number = myScanner.nextLine();
        david.setVahid(number);


        System.out.println(david.getVahid());

    }
}
