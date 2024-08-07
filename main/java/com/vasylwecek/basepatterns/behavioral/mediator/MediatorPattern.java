package main.java.com.vasylwecek.basepatterns.behavioral.mediator;


public class MediatorPattern {
    public static void main(String[] args) {
        AirTrafficController atc = new AirTrafficController();

        Airplane airplane1 = new Airplane("A123", atc);
        Airplane airplane2 = new Airplane("B456", atc);
        Airplane airplane3 = new Airplane("C789", atc);

        airplane1.requestLanding();
        airplane2.requestTakeoff();
        airplane3.requestLanding();
    }
}

