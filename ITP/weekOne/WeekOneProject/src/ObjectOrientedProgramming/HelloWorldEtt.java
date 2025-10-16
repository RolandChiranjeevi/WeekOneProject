package ObjectOrientedProgramming;

public class HelloWorldEtt {
    private String vahid;

    public HelloWorldEtt(String vahid) {
        this.vahid = vahid;
    }

    public String getVahid() {
        return vahid;
    }

    public void setVahid(String vahid) {
        this.vahid += vahid;
    }
}
