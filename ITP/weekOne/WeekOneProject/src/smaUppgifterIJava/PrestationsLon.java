package smaUppgifterIJava;

public class PrestationsLon {
    public static void main(String[] args) {
        int baseWage = 8000;
        double percentOfProvision = 1.09;
        double sumOfSales = 10000;

        double wageWithProvision = baseWage+sumOfSales*percentOfProvision;
        System.out.println(wageWithProvision);
    }
}
