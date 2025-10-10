package smaUppgifterIJava;

public class ModuloOperator {
    public static void main(String[] args) {
        int isNumberEven = 285461;
        int moduloOperator = isNumberEven%2;
        System.out.println(moduloOperator);

        if (moduloOperator==0) System.out.println("The number is even!");
        else if (moduloOperator!=0) {
            System.out.println("The number is not even!");

        }
    }
}
