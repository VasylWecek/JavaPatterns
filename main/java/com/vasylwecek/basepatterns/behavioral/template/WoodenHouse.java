package main.java.com.vasylwecek.basepatterns.behavioral.template;

public class WoodenHouse extends HouseTemplate {

    @Override
    void addCustomFeatures() {
        System.out.println("Adding wooden details and decorative elements");
    }
}
