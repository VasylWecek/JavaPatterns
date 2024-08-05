package main.java.com.vasylwecek.basepatterns.creation.factory;

public abstract class CarFactory {
    public abstract Car createCar();

    public void testDrive(){
        Car car = createCar();
        car.drive();
    }
}
