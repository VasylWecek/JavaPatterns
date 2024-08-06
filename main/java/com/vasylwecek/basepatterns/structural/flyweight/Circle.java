package main.java.com.vasylwecek.basepatterns.structural.flyweight;

public class Circle {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Draw circle: color " + color + ", x: " + x + ", y: " + y + ", radius: " + radius);
    }
}
