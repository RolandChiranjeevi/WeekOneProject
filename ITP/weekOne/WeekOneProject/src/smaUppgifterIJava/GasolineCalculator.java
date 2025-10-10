package smaUppgifterIJava;

public class GasolineCalculator {
    public static void main(String[] args) {
        double gasolinePrice = 10;
        double amountOfGasoline = 10;
        double discountPercent = 0.88;
        double totalPriceToPay = gasolinePrice*amountOfGasoline*discountPercent;
        System.out.println(totalPriceToPay);
    }
}
