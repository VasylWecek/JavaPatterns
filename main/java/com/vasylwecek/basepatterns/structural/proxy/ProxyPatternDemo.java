package main.java.com.vasylwecek.basepatterns.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(1000.00);

        card.pay(500.00);
        System.out.println("Remaining balance: " + card.getBalance());


        card.withdrawCash(200.00);
        System.out.println("Remaining balance: " + card.getBalance());

        card.pay(300.00);
        System.out.println("Remaining balance: " + card.getBalance());
    }
}
