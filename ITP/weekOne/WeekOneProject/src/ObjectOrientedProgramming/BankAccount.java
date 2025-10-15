package ObjectOrientedProgramming;

public class BankAccount {
   private double saldo;

public BankAccount(double saldo) {
    this.saldo = saldo;
}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void deposit(double amount) {
    saldo += amount;


    }

    public boolean withdrawMoney(double amount) {
    if (saldo >= amount) {
        this.saldo -=amount;
        return true;
    }
    else return false;

    }
}
