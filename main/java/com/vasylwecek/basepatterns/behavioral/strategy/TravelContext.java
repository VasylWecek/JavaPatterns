package main.java.com.vasylwecek.basepatterns.behavioral.strategy;

public class TravelContext {
    private Transport transport;

    public TravelContext(Transport transport) {
        this.transport = transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void goToAirport(){
        transport.travel();
    }
}


