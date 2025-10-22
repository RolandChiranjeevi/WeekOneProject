package WeekThreeThings;

public class Spelling {
    private String firstQuestion;
    private String secondQuestion;
    private String thirdQuestion;
    private int totalPoints;

public Spelling(String firstWord, String secondWord, String thirdWord, int totalPoints) {
    this.firstQuestion = firstWord;
    this.secondQuestion = secondWord;
    this.thirdQuestion = thirdWord;
    this.totalPoints = totalPoints;
}
public static String getFirstQuestion() {
     return "Who was appointed as the new coach for the national team?";
}

public static String getSecondQuestion() {
    return "What is the highest mountain in Sweden?";
}

public static String getThirdQuestion() {
    return "What is the name of the ukrainian president?";
}


public String getFirstAnswer() {
    return "Graham Potter";
}
public String getSecondAnswer () {
    return "Kebnekaise";
}

public String getThirdAnswer() {
    return "Zelenskyj";
}

    public int getTotalPoints() {
        return totalPoints;
    }

    public void addPoints() {
        totalPoints ++;
    }
}
