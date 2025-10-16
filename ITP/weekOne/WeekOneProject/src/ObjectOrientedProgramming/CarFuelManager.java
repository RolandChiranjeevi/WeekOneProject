package ObjectOrientedProgramming;

import java.util.Scanner;

public class CarFuelManager {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CarFuel volvoCar = new CarFuel(33.5,70,1);
        CarFuel bmw = new CarFuel(15,80,0.5);
        System.out.println("You currently have "+ bmw.fuelLevel());
        System.out.print("How much fuel would you like to add to your car? ");
        double addFuels = myScanner.nextDouble();
        bmw.addFuel(addFuels);
        System.out.println("Your new fuellevel is: "+bmw.fuelLevel());
        System.out.printf("You use: %.2f%% of your total tank capacity", bmw.getTankCapacity());
        /*System.out.println("What is the fuel consumption of your car? ");
        double fuelConsumpt = myScanner.nextDouble();
        */
        bmw.howLongDrive();
        System.out.println("Your car uses: "+bmw.howLongDrive2()+"l per mile");
        System.out.println("So you can drive roughly: "+bmw.howLongDrive());

    }
}
