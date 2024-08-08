package main.java.com.vasylwecek.basepatterns.behavioral.state;

public class GreenLightState implements State{
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Green light: drive");
        trafficLight.setState(new YellowLightState());
    }
}
