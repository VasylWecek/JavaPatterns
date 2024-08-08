package main.java.com.vasylwecek.basepatterns.behavioral.state;

public class TrafficLight {
    private State currentState;

    public TrafficLight() {
        this.currentState = new GreenLightState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void change(){
        currentState.handle(this);
    }
}
