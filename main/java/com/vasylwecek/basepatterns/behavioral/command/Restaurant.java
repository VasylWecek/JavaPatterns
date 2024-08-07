package main.java.com.vasylwecek.basepatterns.behavioral.command;

public class Restaurant {
    public static void main(String[] args) {
        Cook cook  = new Cook();

        Order steakOrder = new SteakOrder(cook);
        Order saladOrder = new SaladOrder(cook);
        Order soupOrder = new SoupOrder(cook);

        Waiter waiter = new Waiter();

        waiter.takeOrder(steakOrder);
        waiter.takeOrder(saladOrder);
        waiter.takeOrder(soupOrder);

        waiter.placeOrder();
    }
}
