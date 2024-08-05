package main.java.com.vasylwecek.basepatterns.structural.bridge;

public class Square extends Shape{

    public Square(Color color){
        super (color);
    }

    @Override
    void draw() {
        System.out.println("Draw a square");
        color.applyColor();
    }
}
