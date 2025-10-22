package WeekThreeThings;

public class Dog {
    private int dogYear;
    private String dogRace;
    private String dogName;

    public Dog(int dogYear,String dogRace,String dogName){
        this.dogYear=dogYear;
        this.dogName=dogName;
        this.dogRace=dogRace;
    }

    public int getDogYear() {
        return dogYear;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogRace() {
        return dogRace;
    }

    public int humanDogAge(){
        return dogYear*7;
    }

    public String dogSaysWhat(){
        return "voff";
    }
}
