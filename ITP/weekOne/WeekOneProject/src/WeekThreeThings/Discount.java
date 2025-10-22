package WeekThreeThings;

public class Discount {
    private double discountBaby;
    private double productPrice;

    public Discount(double discountBaby,double productPrice) {
        this.discountBaby = discountBaby;
        this.productPrice = productPrice;
    }

    public double applyDiscount() {
        return discountBaby*productPrice;

    }

}
