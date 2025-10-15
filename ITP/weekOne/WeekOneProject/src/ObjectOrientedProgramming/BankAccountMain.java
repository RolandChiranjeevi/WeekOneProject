package ObjectOrientedProgramming;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        BankAccount myAccount = new  BankAccount(0);

        System.out.println("Your balance is: "+myAccount.getSaldo());
        System.out.print("How much money would you like to deposit? ");
        double toDeposit = myScanner.nextDouble();
        myAccount.deposit(toDeposit);
        System.out.println("Your deposit was successful! Your new balance is: "+ myAccount.getSaldo());
        System.out.print("How much money would you like to withdraw? ");
        double toWithdraw = myScanner.nextDouble();
         if (!myAccount.withdrawMoney(toWithdraw)){
            System.out.println("You do not have that much money to withdraw! You only have: "+myAccount.getSaldo());
        } else {
            System.out.println("Withdrawal successful! Your new balance is: "+myAccount.getSaldo());
        }
    }
}
