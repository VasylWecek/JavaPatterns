package main.java.com.vasylwecek.basepatterns.behavioral.observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
