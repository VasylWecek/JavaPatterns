package main.java.com.vasylwecek.basepatterns.behavioral.strategy;

public class Bus implements Transport{
    @Override
    public void travel() {
        System.out.println("Bus to the airport");
    }
}
