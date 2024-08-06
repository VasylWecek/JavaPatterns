package main.java.com.vasylwecek.basepatterns.structural.proxy;

public class Cash implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payments a cash $ " + amount);
    }
}
