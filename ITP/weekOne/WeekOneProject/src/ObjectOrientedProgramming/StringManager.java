package ObjectOrientedProgramming;

public class StringManager {
    public static void main(String[] args) {
        String myString = "mintextis";

        if (myString.equals("min 4text")) {
            System.out.println("it is!");
        } else {
            System.out.println("It isn't!");
        }

        if (myString.length() <= 9) {
            System.out.println("The text is 9 characters!");
        }

        System.out.println(myString.charAt(myString.length()-5));
    }
}
