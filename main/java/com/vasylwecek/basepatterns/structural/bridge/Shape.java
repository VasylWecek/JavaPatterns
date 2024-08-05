package main.java.com.vasylwecek.basepatterns.structural.bridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
