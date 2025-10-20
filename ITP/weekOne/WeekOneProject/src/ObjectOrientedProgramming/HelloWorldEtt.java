package ObjectOrientedProgramming;

public class HelloWorldEtt {
    private String name;

    public HelloWorldEtt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name += name;
    }
}
