package main.java.com.vasylwecek.basepatterns.creation.factory;

public class ToyotaFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Toyota();
    }
}
