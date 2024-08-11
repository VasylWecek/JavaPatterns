package main.java.com.vasylwecek.basepatterns.behavioral.strategy;

public class TouristRunner {
    public static void main(String[] args) {

        TravelContext context = new TravelContext(new Bus());
        context.goToAirport();

        context.setTransport(new Taxi());
        context.goToAirport();

        context.setTransport(new Bicycle());
        context.goToAirport();
    }
}
