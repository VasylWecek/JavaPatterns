package main.java.com.vasylwecek.basepatterns.behavioral.strategy;

public class Bicycle implements Transport{
    @Override
    public void travel() {
        System.out.println("Bicycle to the airport");
    }
}
