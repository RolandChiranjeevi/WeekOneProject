package WeekThreeThings;

import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hi, My name is Circlus and I will help you calculate your circle!");
        System.out.print("What is the radius of your first circle? ");
        double radius1 = myScanner.nextDouble();
        Circle circle1 = new Circle(radius1);
        System.out.print("What is the radius of your second circle? ");
        double radius2 = myScanner.nextDouble();
        Circle circle2 = new Circle(radius2);

        if (circle2.isBiggerThan(circle1)) {
            System.out.println("The second circle is larger than the first circle!");
            System.out.println("The area of this circle is: "+circle2.calculateArea());
            System.out.println("The circumference of this circle is: "+circle2.calculateCircumference());
        } else {
            System.out.println("The first circle is larger than the second one!");
            System.out.println("The area of this circle is: "+circle1.calculateArea());
            System.out.println("The circumference of this circle is: "+circle1.calculateCircumference());
        }

        myScanner.close();
    }
}
