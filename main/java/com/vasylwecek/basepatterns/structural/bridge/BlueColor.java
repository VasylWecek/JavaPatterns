package main.java.com.vasylwecek.basepatterns.structural.bridge;

public class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Color is blue");
    }
}
