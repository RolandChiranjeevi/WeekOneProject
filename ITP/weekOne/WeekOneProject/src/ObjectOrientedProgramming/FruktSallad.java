package ObjectOrientedProgramming;

import java.util.Scanner;

public class FruktSallad {
    public static void main(String[] args) {

            //Scanner scan1 = new Scanner(System.in);
            //System.out.print("Välj en färg på ett äpple: ");
           // String color = scan1.nextLine();
            //Frukt apple = new Frukt(color);
            //System.out.println("Du valde - "+apple.getColor());
           Frukt fruit1 = new Frukt("Grön","Äpple",3);
           Frukt fruit2 = new Frukt("Röd","Päron",45);
           Frukt fruit3 = new Frukt("Gul","Banan",12);
           Frukt vahid = new Frukt("Orange","Päron",2);
           Frukt david = new Frukt("Grön","Melon",3);

           fruit1.fruitSalad();
           fruit2.fruitSalad();
           fruit3.fruitSalad();
           vahid.fruitSalad();
           david.fruitSalad();
        }

}
