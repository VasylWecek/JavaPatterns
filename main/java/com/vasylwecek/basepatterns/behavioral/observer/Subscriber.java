package main.java.com.vasylwecek.basepatterns.behavioral.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String edition) {
        System.out.println("Subscriber " + name + " get new version " + edition);
    }
}
