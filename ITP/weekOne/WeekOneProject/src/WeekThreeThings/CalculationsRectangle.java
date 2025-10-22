package WeekThreeThings;

import java.util.Scanner;

public class CalculationsRectangle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Write your dimensions for your longside of your rectangle: ");
        double inputA = myScanner.nextDouble();
        System.out.print("Write your dimensions for your shortside of your rectangle: ");
        double inputB = myScanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(inputA,inputB);
        if(rectangle1.isSquare()){
            System.out.printf("This is a square, but it's fine. The area for this square is: "+"%.2f\n",rectangle1.calculateArea());
            System.out.println("This is also a square, so the perimeter of this square is: "+rectangle1.calculatePerimeter());
        }
        else{
            System.out.printf("Your rectangle has the area of: "+"%.2f\n",rectangle1.calculateArea());
            System.out.println("Your rectangle has the perimeter of: "+rectangle1.calculatePerimeter());
        }



    }
}
