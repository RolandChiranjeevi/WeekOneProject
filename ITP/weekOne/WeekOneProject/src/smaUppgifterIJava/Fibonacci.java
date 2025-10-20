package smaUppgifterIJava;

public class Fibonacci {
    public static void main(String[] args) {
        int tal1 = 1;
        int tal2 = 1;
        while (tal2 <= 100000000) {
            System.out.println(tal2);
           int tal3 = tal1 + tal2;
           tal1 = tal2;
           tal2 = tal3;

        }
    }
}
