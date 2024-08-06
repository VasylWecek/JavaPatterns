package main.java.com.vasylwecek.basepatterns.structural.proxy;

public class CreditCard implements Payment{
    private Cash cash;
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
        this.cash = new Cash();
    }

    @Override
    public void pay(double amount) {
        if (balance >= amount) {
            System.out.println("Payments credit card $ " + amount);
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void withdrawCash(double amount) {
        if (balance >= amount) {
            cash.pay(amount);
            balance -= amount;
            System.out.println("Withdrawal cash $ " + amount);
        }else {
            System.out.println("Insufficient funds in credit card for withdrawal cash");
        }
    }

    public double getBalance() {
        return balance;
    }
}
