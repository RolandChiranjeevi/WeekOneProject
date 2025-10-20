package ObjectOrientedProgramming;

public class Rectangle {
    private double numberOne,numberTwo;

    public Rectangle(double longSide,double shortSide) {
        this.numberOne = longSide;
        this.numberTwo = shortSide;
    }

public double calculateArea() {
        return numberOne*numberTwo;
}

public double calculatePerimeter() {
        return (numberOne*2)+(numberTwo*2);
}

public boolean isSquare() {
        return numberOne == numberTwo;

}

}
