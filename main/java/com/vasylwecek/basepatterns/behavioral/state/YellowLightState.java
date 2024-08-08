package main.java.com.vasylwecek.basepatterns.behavioral.state;

public class YellowLightState implements State{
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Yellow light: prepare");
        trafficLight.setState(new RedLightState());
    }
}
