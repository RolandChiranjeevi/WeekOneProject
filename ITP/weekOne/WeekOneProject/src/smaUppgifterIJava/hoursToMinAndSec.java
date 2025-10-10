package smaUppgifterIJava;

public class hoursToMinAndSec {
    public static void main(String[] args) {
        int hoursInADay = 10;
        int minutesByHours = hoursInADay*60;
        int secondsByMinutes = minutesByHours*60;

        System.out.println(hoursInADay);
        System.out.println(minutesByHours);
        System.out.println(secondsByMinutes);
    }
}
