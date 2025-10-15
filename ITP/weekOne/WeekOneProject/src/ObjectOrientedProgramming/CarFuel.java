package ObjectOrientedProgramming;

public class CarFuel {
    double fuelLevel;
    double tankCapacity;
    double fuelConsumption;

 public CarFuel(double fuelLevel, double tankCapacity, double fuelConsumption) {
     this.fuelLevel = fuelLevel;
     this.tankCapacity = tankCapacity;
     this.fuelConsumption = fuelConsumption;
 }

 public double fuelLevel(){
     return fuelLevel;
 }
 public double tankCapacity(){
     return tankCapacity;
 }
public double getFuelConsumption() {
     return fuelConsumption;
}
public void addFuel(double fuel) {
        fuelLevel += fuel;
}
public double howLongDrive() {
    return fuelConsumption * fuelLevel;
}
public double getTankCapacity() {
     return fuelLevel/tankCapacity;
}
    public double howLongDrive2() {
        return fuelConsumption;
    }
}
