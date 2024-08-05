package main.java.com.vasylwecek.basepatterns.creation.factory;

public class Main {
    public static void main(String[] args) {
        CarFactory toyotaFactory = new ToyotaFactory();
        CarFactory fordFactory = new FordFactory();
        CarFactory bmwFactory = new BMWFactory();

        toyotaFactory.testDrive();
        fordFactory.testDrive();
        bmwFactory.testDrive();
    }
}
