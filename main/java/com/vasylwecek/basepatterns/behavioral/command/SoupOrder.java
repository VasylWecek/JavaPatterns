package main.java.com.vasylwecek.basepatterns.behavioral.command;

public class SoupOrder implements Order {
    private Cook cook;

    public SoupOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cookSoup();
    }
}
