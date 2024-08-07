package main.java.com.vasylwecek.basepatterns.behavioral.mediator;

public interface Mediator {
    void notify(Object sender, String event);
    void requestLanding(Airplane airplane);
    void requestTakeoff(Airplane airplane);
}
