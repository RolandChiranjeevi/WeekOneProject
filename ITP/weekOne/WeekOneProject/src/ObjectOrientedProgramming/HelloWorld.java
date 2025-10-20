package ObjectOrientedProgramming;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
       Scanner myScanner = new Scanner(System.in);
       // HelloWorldEtt vahid = new HelloWorldEtt();
        HelloWorldEtt david = new HelloWorldEtt("Hej ");
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        david.setName(name);


        System.out.println(david.getName());

    }
}
