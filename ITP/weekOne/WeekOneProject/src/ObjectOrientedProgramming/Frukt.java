package ObjectOrientedProgramming;
//1. Skapa en class Fruit som beskriver olika frukter
// 2. Attributet som definieras i konstruktorn heter color och är fruktens färg
// 3. Skapa tre olika Fruit ifrän main-metod i en annan klass Fruitsalaca
// 4. Utöka Fruit sä att det kan skriva ut färgen pả frukten
// 5. Anropa denna metod för de tre frukterna i FruitSalad

//Vår klass Frukt och vilken information vi vill spara.
public class Frukt {
   private String color;
   private String typeOfFruit;
   private int amountOfFruit;
//Konstruktorn som talar om var datan ska sparas i vilken variabel.
    public Frukt(String color,String typeOfFruit, int amountOfFruit)   {
        this.color = color;
        this.typeOfFruit = typeOfFruit;
        this.amountOfFruit = amountOfFruit;
    }

// Vår metod som vi sedan anropar i vår klass Fruktsallad.
    protected void fruitSalad(){
        System.out.println("Färg på frukt: "+color);
        System.out.println("Mängd av frukt: "+amountOfFruit);
        System.out.println("Typ av frukt: "+typeOfFruit);
    }
}
//, String typeOfFruit, int amountOfFruit