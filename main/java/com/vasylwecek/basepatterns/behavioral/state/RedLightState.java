package main.java.com.vasylwecek.basepatterns.behavioral.state;

public class RedLightState implements State{
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Red light: stop");
        trafficLight.setState(new GreenLightState());
    }
}
