package main.java.com.vasylwecek.basepatterns.behavioral.template;

public class TemplateMethodExample {
    public static void main(String[] args) {
        HouseTemplate woodenHouse = new WoodenHouse();
        System.out.println("Building a wooden house:");
        woodenHouse.buildHouse();

        System.out.println();

        HouseTemplate glassHouse = new GlassHouse();
        System.out.println("Building a glass house:");
        glassHouse.buildHouse();
    }
}

