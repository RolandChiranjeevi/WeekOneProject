package WeekThreeThings;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        //Scanner myScanner = new Scanner(System.in);
        Discount apples = new Discount(0.8,10);

        System.out.println("The prices of your apples after discount is: "+apples.applyDiscount());
        apples.applyDiscount();

    }
}
