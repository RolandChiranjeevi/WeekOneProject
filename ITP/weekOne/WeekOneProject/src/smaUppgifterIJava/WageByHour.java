package smaUppgifterIJava;
//.En anställd som har timlön får, när arbetstiden överstiger 40 tim en vecka,
//övertidsbetalning för tiden utöver 40 tim med 1½ tim. Skapa ett program som har sparat
//en anställds timlön och en veckas arbetstid. Den totala veckolönen ska beräknas och
//skrivas ut.
public class WageByHour {
    public static void main(String[] args) {
        double hourlyWage = 12;
        double workingWeek = 41;
        double overtimePay = 1.5*hourlyWage;
        double payCheck;

        if (workingWeek>40){
            payCheck=(hourlyWage*workingWeek)+(overtimePay*(workingWeek-40));
            System.out.println("Your paycheck would be: "+payCheck);
        }else {
            payCheck=hourlyWage*workingWeek;
            System.out.println("Your paycheck would be: "+payCheck);
        }
    }
}
//480