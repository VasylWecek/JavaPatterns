package main.java.com.vasylwecek.basepatterns.structural.bridge;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Color is red");
    }
}
