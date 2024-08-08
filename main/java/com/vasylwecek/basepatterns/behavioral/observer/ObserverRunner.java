package main.java.com.vasylwecek.basepatterns.behavioral.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();

        Subscriber subscriber1 = new Subscriber("John");
        Subscriber subscriber2 = new Subscriber("Jane");
        Subscriber subscriber3 = new Subscriber("Jack");

        magazine.subscribe(subscriber1);
        magazine.subscribe(subscriber2);
        magazine.subscribe(subscriber3);

        magazine.releaseNewEdition("Edition 1");

        magazine.unsubscribe(subscriber2);

        magazine.releaseNewEdition("Edition 2");
    }
}
