package main.java.com.vasylwecek.basepatterns.creation.factory;

public class BMWFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new BMW();
    }
}
