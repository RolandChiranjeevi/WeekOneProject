package ObjectOrientedProgramming;

import java.util.Scanner;

public class CarFuelManager {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CarFuel volvoCar = new CarFuel(33.5,70,1);
        System.out.println("You currently have "+ volvoCar.fuelLevel());
        System.out.print("How much fuel would you like to add to your car? ");
        double addFuels = myScanner.nextDouble();
        volvoCar.addFuel(addFuels);
        System.out.println("Your new fuellevel is: "+volvoCar.fuelLevel());
        System.out.printf("You use: %.2f%% of your total tank capacity", volvoCar.getTankCapacity());
        /*System.out.println("What is the fuel consumption of your car? ");
        double fuelConsumpt = myScanner.nextDouble();
        */
        volvoCar.howLongDrive();
        System.out.println("Your car uses: "+volvoCar.howLongDrive2()+"l per mile");
        System.out.println("So you can drive roughly: "+volvoCar.howLongDrive());

    }
}
