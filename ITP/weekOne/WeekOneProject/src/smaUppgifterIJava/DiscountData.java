package smaUppgifterIJava;
//En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle
//handlar för minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett
//visst slag. Skapa ett program som beräknar vad en kund ska betala. Indata till algoritmen
//ska vara antalet köpta enheter och priset per enhet.
public class DiscountData {
    public static void main(String[] args) {
    double discount = 0.9;
    double unitsBought = 2;
    double pricePerUnit = 99.6;
    double calculatedDiscount = discount*pricePerUnit;
    double totalPrice=calculatedDiscount*unitsBought;
    double finalPrice = unitsBought*pricePerUnit;
    double finalPriceWithDiscount;


        //System.out.println(totalPrice);

        if (finalPrice>=1000) {
            finalPriceWithDiscount = finalPrice*discount;
            //System.out.println(finalPriceWithDiscount);
        } else {
            finalPriceWithDiscount=finalPrice;
            //System.out.println(finalPriceWithDiscount);
        }
        System.out.println("Your totalprice to pay is "+finalPriceWithDiscount+"kr!");
    }
}