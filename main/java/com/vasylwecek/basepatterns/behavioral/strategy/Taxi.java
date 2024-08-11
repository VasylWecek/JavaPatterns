package main.java.com.vasylwecek.basepatterns.behavioral.strategy;

public class Taxi implements Transport{
    @Override
    public void travel() {
        System.out.println("Taxi to the airport");
    }
}
