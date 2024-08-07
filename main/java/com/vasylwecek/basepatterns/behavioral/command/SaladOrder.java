package main.java.com.vasylwecek.basepatterns.behavioral.command;

public class SaladOrder implements Order {
    private Cook cook;

    public SaladOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cookSalad();
    }
}
