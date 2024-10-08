package main.java.com.vasylwecek.basepatterns.structural.flyweight;

public class FlyweightPatternDemo {
    private static final String[] colors = {"Red", "Blue", "Green", "Yellow"};

    public static void main(String[] args) {
        for (int i=0; i<20; ++i){
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
