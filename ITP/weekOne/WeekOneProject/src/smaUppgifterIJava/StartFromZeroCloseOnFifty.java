package smaUppgifterIJava;

public class StartFromZeroCloseOnFifty {
    public static void main(String[] args) {
       int nummer = 0;
       int summa = 0;
       while (summa <= 50){
           System.out.println(nummer);
           summa += nummer;
           nummer += 1;
       }
    }
}
