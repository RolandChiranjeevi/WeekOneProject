package smaUppgifterIJava;
//En kommun har gjort följande prognos för befolkningsutvecklingen de närmaste åren:
//- Vid början av 2016 hade kommunen 26000 invånare.
//- Antalet födda och avlidna under ett år uppskattas var 0.7 % resp 0.6 % av befolkningen
//vid årets början.
//- Antalet inflyttade och antalet utflyttade uppskattas till 300 resp 325 varje år.
//Skapa ett program som beräknar kommunens uppskattade invånarantal i början av ett
//visst år. Vilket år det gäller är indata till algoritmen.
public class EstimatePopulation {
    public static void main(String[] args) {
        double startingPopulation = 26000;
        double yearlyBorn = 0.07; //2080
        double yearlyDead = 0.06; //1560
        double movedIn = 300;
        double movedOut = 325;
        double estimatedPopulationByYear = 2030;
        double postiveYearly = startingPopulation*yearlyBorn;
        double negativeYearly = startingPopulation*yearlyDead;
        double postive = postiveYearly+movedIn;
        double negative = negativeYearly+movedOut;
        double yearly = postive-negative;
        System.out.println(postiveYearly);
        System.out.println(negativeYearly);
        System.out.println(yearly);
        System.out.println(postive);
        System.out.println(negative);


        for (int year = 2016; year <= estimatedPopulationByYear;year++){
            startingPopulation=startingPopulation+(startingPopulation*yearlyBorn+movedIn)-(startingPopulation*yearlyDead+movedOut);
            System.out.println("The estimated population in year "+year+" is roughly "+startingPopulation);
        }

    }
}
//for (int year = 1; year <= month;year++){
//            startingAmount=(startingAmount+depositAmount)+interest;
//            System.out.println("År "+year+": "+String.format("%.2f",startingAmount));
//        }