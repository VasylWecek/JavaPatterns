package main.java.com.vasylwecek.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Subject{
    private List<Observer> subscribers;
    private String latestEdition;

    public Magazine() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(latestEdition);
        }
    }
    public void releaseNewEdition(String edition) {
        this.latestEdition = edition;
        notifyObservers();
    }
}
