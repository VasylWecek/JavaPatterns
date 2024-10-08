package main.java.com.vasylwecek.basepatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder(){
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
