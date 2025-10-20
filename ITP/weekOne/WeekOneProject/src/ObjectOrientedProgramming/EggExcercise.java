package ObjectOrientedProgramming;

import java.util.Scanner;

public class EggExcercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Skriv in ett ord änna: ");
        String text = myScanner.nextLine();

        if(text.equals("ägg")) {
            System.out.println("Ägg är knasigt!");
        } else {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i) + " ");
            }
        }

    }
}
