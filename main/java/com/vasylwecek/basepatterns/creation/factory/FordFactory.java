package main.java.com.vasylwecek.basepatterns.creation.factory;

public class FordFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Ford();
    }
}
