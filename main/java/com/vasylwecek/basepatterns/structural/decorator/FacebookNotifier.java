package main.java.com.vasylwecek.basepatterns.structural.decorator;

public class FacebookNotifier extends NotifierDecorator{
    private String facebookId;

    public FacebookNotifier(Notifier notifier, String facebookId) {
        super(notifier);
        this.facebookId = facebookId;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Send Facebook Notification: " + message);
    }
}
