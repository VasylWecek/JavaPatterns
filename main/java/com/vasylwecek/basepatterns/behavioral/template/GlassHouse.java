package main.java.com.vasylwecek.basepatterns.behavioral.template;

public class GlassHouse extends HouseTemplate {

    @Override
    void addCustomFeatures() {
        System.out.println("Installing large glass walls and ceilings");
    }
}

