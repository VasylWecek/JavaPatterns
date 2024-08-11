package main.java.com.vasylwecek.basepatterns.behavioral.template;

public abstract class HouseTemplate {

    public final void buildHouse() {
        layFoundation();
        buildWalls();
        buildRoof();
        installWindows();
        addCustomFeatures();
    }

    private void layFoundation() {
        System.out.println("Laying the foundation");
    }

    private void buildWalls() {
        System.out.println("Building walls");
    }

    private void buildRoof() {
        System.out.println("Building roof");
    }

    private void installWindows() {
        System.out.println("Installing windows");
    }

    abstract void addCustomFeatures();
}

