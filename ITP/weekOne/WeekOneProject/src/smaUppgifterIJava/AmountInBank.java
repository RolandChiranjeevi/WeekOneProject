package smaUppgifterIJava;
//6.Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av
//de följande 10 åren om man sätter in 1000 kr. Räntan ska sparas och är densamma för
//alla åren
public class AmountInBank {
    public static void main(String[] args) {
        double startingAmount = 0;
        double interest = 1.0125;
        int depositAmount = 1250;
        int month = 216;

        for (int year = 1; year <= month;year++){
            startingAmount=(startingAmount+depositAmount)+interest;
            System.out.println("År "+year+": "+String.format("%.2f",startingAmount));
        }


        }
    }

