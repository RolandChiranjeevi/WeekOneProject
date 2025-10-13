package ObjectOrientedProgramming;

public class FruktSallad {
    public static void main(String[] args) {

            Frukt fruit1 = new Frukt("Grön","Äpple",3);
            Frukt fruit2 = new Frukt("Röd","Päron",45);
            Frukt fruit3 = new Frukt("Gul","Banan",12);

            fruit1.fruitSalad();
            fruit2.fruitSalad();
            fruit3.fruitSalad();
        }

}
