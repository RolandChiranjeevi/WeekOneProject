package smaUppgifterIJava;

public class CurrencyCalculator {
    public static void main(String[] args) {
        int swedishCrown = 100;
        int usDollar = swedishCrown*6;
        int englishPound = swedishCrown*10;

        System.out.println("If you have "+swedishCrown+" that would equal "+usDollar+"$ or £"+englishPound);
    }
}
