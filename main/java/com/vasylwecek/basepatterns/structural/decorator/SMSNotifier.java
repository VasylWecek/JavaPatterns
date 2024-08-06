package main.java.com.vasylwecek.basepatterns.structural.decorator;

public class SMSNotifier extends NotifierDecorator {
    private String phoneNumber;

    public SMSNotifier(Notifier notifier, String phoneNumber) {
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        super.send(message);
    }
}
