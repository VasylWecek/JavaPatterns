package main.java.com.vasylwecek.basepatterns.structural.bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Draw a circle");
        color.applyColor();
    }
}
