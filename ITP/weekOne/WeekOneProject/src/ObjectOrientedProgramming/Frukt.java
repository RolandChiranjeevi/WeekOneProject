package ObjectOrientedProgramming;

public class Frukt {
    String color;
    String typeOfFruit;
    int amountOfFruit;

    public Frukt(String color, String typeOfFruit, int amountOfFruit)   {
        this.color = color;
        this.typeOfFruit = typeOfFruit;
        this.amountOfFruit = amountOfFruit;
    }

    public void fruitSalad(){
        System.out.println("Färg på frukt: "+color);
        System.out.println("Typ av frukt: "+typeOfFruit);
        System.out.println("Mängd av frukt: "+amountOfFruit);
    }
}
