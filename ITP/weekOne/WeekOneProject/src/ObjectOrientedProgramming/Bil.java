package ObjectOrientedProgramming;

public class Bil {
    private String typeOfCar;
    private String makerOfCar;
    private int modelYear;
    private String typeOfEngine;
    private String carColor;
    private int carPassengers;
    private double fuelConsumption;
    private int previousOwners;


    public Bil (String carType, String carMaker, int modelYear, String engineType, String color,int passengers, double fuelConsumption, int previousOwners ) {
        this.typeOfCar = carType;
        this.makerOfCar = carMaker;
        this.modelYear = modelYear;
        this.typeOfEngine = engineType;
        this.carColor = color;
        this.carPassengers = passengers;
        this.fuelConsumption = fuelConsumption;
        this.previousOwners = previousOwners;
    }

    protected void carDealership(){
        System.out.println("We now have a "+typeOfCar+" made by "+makerOfCar+" and the color of the car is "+carColor);
        System.out.println("Car was manufactured in year "+modelYear);
        System.out.println("It has a "+typeOfEngine+" and the fuel consumption is "+fuelConsumption);
        System.out.println("It can hold up to "+carPassengers+" passengers"+" and the car has had "+previousOwners+"previous owners!");
        System.out.println("Hurry up and buy this marvelous "+makerOfCar);
    }
}
