package main.java.com.vasylwecek.basepatterns.behavioral.command;

public class SteakOrder implements Order {
    private Cook cook;

    public SteakOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cookSteak();
    }
}
