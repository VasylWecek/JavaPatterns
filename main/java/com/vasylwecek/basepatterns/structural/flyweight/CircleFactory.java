package main.java.com.vasylwecek.basepatterns.structural.flyweight;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap<String, Circle> circles = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circles.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circles.put(color, circle);
            System.out.println("Circle created color: " + color);
        }
        return circle;
    }
}
