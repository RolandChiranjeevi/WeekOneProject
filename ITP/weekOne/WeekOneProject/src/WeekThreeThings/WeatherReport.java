package WeekThreeThings;

import java.util.Scanner;

public class WeatherReport {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How is the weather today?");
        System.out.print("Please type in Sunny, Rainy, Cloudy, Snowy or Other");
        String desc = myScanner.nextLine().toLowerCase();
        System.out.print("What is the temperature outside today? ");
        double temperature = myScanner.nextDouble();
        Weather today = new Weather(desc,temperature);

        if (temperature <= 15)

    }
}



//Skapa en klass WeatherReport:
//Konstruktorn ska ta in temperatur och beskrivning
//(t.ex. "soligt", "regnigt").
//Skapa en metod getDescription som returnerar en beskrivning av vädret.
//Skapa ett WeatherReport-objekt i main och skriv ut väderbeskrivningen.