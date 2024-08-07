package main.java.com.vasylwecek.basepatterns.behavioral.mediator;

public class Airplane {
    private String id;
    private Mediator mediator;

    public Airplane(String id, Mediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    public String getId() {
        return id;
    }

    public void requestLanding() {
        System.out.println("Самолёт " + id + ": Запрашивает посадку.");
        mediator.requestLanding(this);
    }

    public void requestTakeoff() {
        System.out.println("Самолёт " + id + ": Запрашивает взлёт.");
        mediator.requestTakeoff(this);
    }

    public void receive(String message) {
        System.out.println("Самолёт " + id + ": Получено сообщение — " + message);
    }
}
