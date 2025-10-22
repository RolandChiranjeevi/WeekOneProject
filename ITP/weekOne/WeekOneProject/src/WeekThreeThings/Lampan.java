package WeekThreeThings;

public class Lampan {
    private boolean lampStatus;

    public Lampan(boolean lampstatus) {
        this.lampStatus = lampstatus;
    }

    public void turnOn() {
        lampStatus = true;
        System.out.println("The light is now on! \uD83D\uDCA1");
    }

    public void turnOff() {
        lampStatus = false;
        System.out.println("The light is now off! \uD83C\uDF19");
    }

    public boolean isOn() {
        return lampStatus;
    }

    public void printStatus() {
        if (lampStatus) {
            System.out.println("The light is now on! \uD83D\uDCA1");
        } else {
            System.out.println("The light is now off! \uD83C\uDF19");
        }
    }

}
