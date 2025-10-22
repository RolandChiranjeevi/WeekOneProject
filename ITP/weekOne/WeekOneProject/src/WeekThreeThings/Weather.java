package WeekThreeThings;

public class Weather {
    private String desc;
    private double temperature;

    public Weather(String desc,double temperature) {
        this.desc = desc;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDesc() {
        return desc;
    }
}

