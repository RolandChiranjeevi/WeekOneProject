package smaUppgifterIJava;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        double celcius = 100;
        double fahrenheit = 9*celcius/5+32;
        System.out.println(fahrenheit);

        System.out.println("If the temperature is "+celcius+" Celcius that would equal "+fahrenheit+" Fahrenheit!");
    }
}
