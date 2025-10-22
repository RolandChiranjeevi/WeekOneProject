package WeekThreeThings;

import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String studentName = myScanner.nextLine();
        System.out.print("What year are you in? ");
        int studentClass = myScanner.nextInt();

        Student student1 = new Student(studentName, studentClass);


        System.out.println("Hello " + student1.getStudentName() + " you are currently in grade " + student1.getStudentClass());
        student1.getPromoted(1);
        System.out.println("Next year you will be promoted to year: " + student1.getStudentClass());
        System.out.println("You are currently in "+Student.stadie(student1.getStudentClass()));
    }
}
